package mikufan.cx.common_vocaloid_entity.vocadb.api.songList.get_listid_songs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;
import mikufan.cx.common_vocaloid_entity.vocadb.api.common.PartialFindResult;
import org.eclipse.collections.api.list.MutableList;

/**
 * response object stored for GET /api/songLists/{listId}/songs
 *
 * @author CX无敌
 */
@ToString(callSuper = true)
public class PartialSongList extends PartialFindResult<SongInListForApiContract> {

  @JsonCreator
  public PartialSongList(
      @JsonProperty("items") MutableList<SongInListForApiContract> items,
      @JsonProperty("term") String term,
      @JsonProperty("totalCount") int totalCount){
    super(items, term, totalCount);
  }

  public void setTotalCount(int totalCount){
    this.totalCount = totalCount;
  }
}