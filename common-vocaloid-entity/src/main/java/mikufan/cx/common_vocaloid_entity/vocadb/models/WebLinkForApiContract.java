// auto-generated by get-my-vocadb-java-model at 2020-06-24T21:05:23.272316300
package mikufan.cx.common_vocaloid_entity.vocadb.models;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.eclipse.collections.api.list.MutableList;

@Getter(onMethod_ = {@JsonIgnore}) @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WebLinkForApiContract {

  @JsonProperty
  private String category;

  @JsonProperty
  private String description;

  @JsonProperty
  private String descriptionOrUrl;

  @JsonProperty
  private int id;

  @JsonProperty
  private String url;

}
