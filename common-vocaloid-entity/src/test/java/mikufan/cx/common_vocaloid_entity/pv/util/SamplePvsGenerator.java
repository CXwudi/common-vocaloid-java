package mikufan.cx.common_vocaloid_entity.pv.util;

import mikufan.cx.common_vocaloid_entity.pv.PvService;
import mikufan.cx.common_vocaloid_entity.pv.VocaDbPv;
import mikufan.cx.common_vocaloid_entity.vocadb.api.songList.getListIdSongs.PartialSongList;
import mikufan.cx.common_vocaloid_util.jackson.JsonMapperUtil;
import org.eclipse.collections.api.list.MutableList;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public class SamplePvsGenerator {

  /** this generate multiple IdentifiedPv with repeated songIds */
  public static MutableList<VocaDbPv> generateVocadbPvs() {
    var file = new File("src/test/resources/vocadb/songListNeededResponse.json");
    PartialSongList response = null;
    try {
      response = JsonMapperUtil.createDefaultForReadOnly().readValue(file, PartialSongList.class);
    } catch (IOException e) {
      fail(e);
    }
    assertNotNull(response);
    var pvs = response.getItems().toList().flatCollect(
        item ->
            item.getSong().getPvs().select(pvItem -> PvService.contain(pvItem.getService()))
                .collect(pvItem -> new VocaDbPv(
                        pvItem.getPvId(),
                        PvService.enumOf(pvItem.getService()),
                        pvItem.getName(),
                        item.getSong().getId()
                    )
                )

    );
    return pvs;
  }
}
