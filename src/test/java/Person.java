import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Deprecated
@Inherited
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Person {
    int age() default 0;
    String name() default "";

}
