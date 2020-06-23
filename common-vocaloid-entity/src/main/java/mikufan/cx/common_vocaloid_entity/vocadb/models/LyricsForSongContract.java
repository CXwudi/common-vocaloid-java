// auto-generated by get-my-vocadb-java-model at 2020-06-23T13:06:28.204073200
package mikufan.cx.common_vocaloid_entity.vocadb.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LyricsForSongContract {

  @JsonProperty
  private String cultureCode;

  @JsonProperty
  private int id;

  @JsonProperty
  private String source;

  @JsonProperty
  private String translationType;

  @JsonProperty
  private String url;

  @JsonProperty
  private String value;

}