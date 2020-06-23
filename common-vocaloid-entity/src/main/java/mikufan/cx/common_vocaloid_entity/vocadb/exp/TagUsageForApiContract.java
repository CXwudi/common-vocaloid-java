package mikufan.cx.common_vocaloid_entity.vocadb.exp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class TagUsageForApiContract {

  @JsonProperty
  private int count;

  @JsonProperty
  private TagBaseContract tag;

}