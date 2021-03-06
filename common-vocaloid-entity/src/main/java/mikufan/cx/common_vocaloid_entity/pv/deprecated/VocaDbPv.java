package mikufan.cx.common_vocaloid_entity.pv.deprecated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.util.Comparator;

/**
 * A flatten class for representing a PV with a VocaDB songId to identify itself.
 * <p>
 * Learn JAVA: if you are not using abstract declaration for instance storing in java,
 * then in pojo-json, should never use inheritence notation like @JsonTypeInfo and @JsonSubTypes.
 *
 * without abstract declaration, we can let json don't contain classes info
 * @author CX无敌
 */
@Getter @ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@JsonPropertyOrder({"title", "pvId", "service", "songId"})
public class VocaDbPv extends AbstractPv implements Comparable<VocaDbPv> {
  //a protected default constructor used by jackson only

  /**
   * which song does the pv belongs to. this id in vocadb
   */
  @JsonProperty
  protected int songId;

  public VocaDbPv(@NonNull String pvId, @NonNull String service, String title, int songId) {
    this.pvId = pvId;
    this.service = service;
    this.title = title;
    this.songId = songId;
  }

  /**
   * simply just compare {@link VocaDbPv#songId}.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof VocaDbPv)) {
      return false;
    }
    VocaDbPv vocaDbPv = (VocaDbPv) o;
    return this.songId == vocaDbPv.songId;
  }

  /**
   * @return {@link VocaDbPv#songId}
   */
  @Override
  public int hashCode() {
    return this.songId;
  }

  /**
   * sorted base on {@link VocaDbPv#songId} <p>
   * Learn Java: base on the expectation of compareTo.
   * it's hard to do a conditional comparing, so just do a simple sort
   */
  @Override
  public int compareTo(VocaDbPv o) {
    return Comparator.nullsFirst(Comparator.comparingInt(VocaDbPv::getSongId)).compare(this, o);
  }
}
