// auto-generated by get-my-vocadb-java-model at 2020-06-23T13:06:28.208057500
package mikufan.cx.common_vocaloid_entity.vocadb.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LocalizedStringContract {

  @JsonProperty
  private String language;

  @JsonProperty
  private String value;

}
