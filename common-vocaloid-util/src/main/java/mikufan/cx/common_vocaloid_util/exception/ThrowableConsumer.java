package mikufan.cx.common_vocaloid_util.exception;

import java.util.function.Consumer;

/**
 * @author CX无敌
 */
public interface ThrowableConsumer<T>  {

  /**
   * same as {@link Consumer#accept(java.lang.Object)}, but can throw exception
   * @throws Exception
   */
  void accept(T t) throws Exception;


  /**
   * convert it to the instance of {@link Consumer}
   */
  static <T> Consumer<T> toConsumer(ThrowableConsumer<T> f){
    return (in) -> {
      try {
        f.accept(in);
      } catch (Exception ex) {
        SneakyThrow.theException(ex);
      }
    };
  }

  /**
   * the instance method of {@link ThrowableSupplier#toSupplier(ThrowableSupplier)}
   */
  default Consumer<T> toConsumer(){
    return toConsumer(this);
  }
}
