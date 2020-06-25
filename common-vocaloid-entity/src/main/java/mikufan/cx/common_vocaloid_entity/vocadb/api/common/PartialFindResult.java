// auto-generated by get-my-vocadb-java-model at 2020-06-24T21:05:22.748691700
package mikufan.cx.common_vocaloid_entity.vocadb.api.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter(onMethod_ = {@JsonIgnore}) @ToString
@Builder
public class PartialFindResult<T> {

  @JsonProperty
  protected MutableList<T> items;

  @JsonProperty
  protected String term;

  @JsonProperty
  protected int totalCount;

  @JsonCreator
  public PartialFindResult(
      @JsonProperty("items") MutableList<T> items, 
      @JsonProperty("term") String term, 
      @JsonProperty("totalCount") int totalCount){
    this.items = items;
    this.term = term;
    this.totalCount = totalCount;
  }
}
