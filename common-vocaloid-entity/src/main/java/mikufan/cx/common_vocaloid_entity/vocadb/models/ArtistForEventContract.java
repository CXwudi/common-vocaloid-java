// auto-generated by get-my-vocadb-java-model at 2020-06-23T13:06:28.223014800
package mikufan.cx.common_vocaloid_entity.vocadb.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArtistForEventContract {

  @JsonProperty
  private ArtistContract artist;

  @JsonProperty
  private String effectiveRoles;

  @JsonProperty
  private int id;

  @JsonProperty
  private String name;

  @JsonProperty
  private String roles;

}
