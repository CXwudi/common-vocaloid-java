// auto-generated by get-my-vocadb-java-model at 2020-06-23T13:06:28.206062900
package mikufan.cx.common_vocaloid_entity.vocadb.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EntryThumbForApiContract {

  @JsonProperty
  private String mime;

  @JsonProperty
  private String urlOriginal;

  @JsonProperty
  private String urlSmallThumb;

  @JsonProperty
  private String urlThumb;

  @JsonProperty
  private String urlTinyThumb;

}
