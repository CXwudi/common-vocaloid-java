package mikufan.cx.common_vocaloid_entity.pv.deprecated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * A skeleton class to simply represent the necessary filed that a PV class can have.<p>
 * Note: Only use this class by extending, no declaration on this class
 * @author CX无敌
 * @deprecated user app just extends {@link mikufan.cx.common_vocaloid_entity.pv.BasePv} instead
 */
@Getter @ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@JsonPropertyOrder({"title", "pvId", "service"})
@Deprecated
public abstract class AbstractPv {
  // is better to have a protected default constructor for jackson for this class and subclasses
  // the equals() is designed to make sure every single PV is a different instance

  // Learn Jackson: if, in the future, we want encapselation, we add these notation:
  //@JsonTypeInfo(
//    use = JsonTypeInfo.Id.NAME,
//    include = JsonTypeInfo.As.PROPERTY,
//    property = "_type"
//)
//@JsonSubTypes({
//    @JsonSubTypes.Type(value = IdentifiedPv.class, name = "identified pv"),
//    @JsonSubTypes.Type(value = PvOld.class, name = "pv")
//    //New subclass need to be declared here
//})

  /**
   * the website specific id
   */
  @JsonProperty
  protected String pvId;

  /**
   * which website does it belongs to
   */
  @JsonProperty
  protected String service;

  /**
   * title of the pv, can be null <p>
   * noticed that this is not the actual name of the song, but the title that shown on video website
   */
  @JsonProperty
  protected String title;

//  @Override
//  public abstract boolean equals(Object o);
//
//  @Override
//  public abstract int hashCode();
}
