// auto-generated by get-my-vocadb-java-model at 2020-06-24T21:05:23.257332400
package mikufan.cx.common_vocaloid_entity.vocadb.models;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.eclipse.collections.api.list.MutableList;

@Getter(onMethod_ = {@JsonIgnore}) @ToString
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
