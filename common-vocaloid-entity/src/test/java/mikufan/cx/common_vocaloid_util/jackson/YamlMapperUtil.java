package mikufan.cx.common_vocaloid_util.jackson;

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * a util class about yaml object mapper
 * @author CX无敌
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class YamlMapperUtil extends ObjMapperUtil {

  public static YAMLMapper createDefault(){
    return ObjMapperUtil.addDefaultFlagsForReadWrite(YAMLMapper.builder());
  }

  public static YAMLMapper createDefaultForReadOnly(){
    return ObjMapperUtil.addDefaultFlagsForReadOnly(YAMLMapper.builder());
  }
}
