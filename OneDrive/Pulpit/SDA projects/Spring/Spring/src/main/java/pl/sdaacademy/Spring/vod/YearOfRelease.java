package pl.sdaacademy.Spring.vod;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = YearOfReleaseValidator.class)
public @interface YearOfRelease {
    String message() default "Year of release need to be between 1900 and 2050";
    Class<?>[] groups() default  { };
    Class<? extends Payload>[] payload() default {};
}
class YearOfReleaseValidator implements ConstraintValidator<YearOfRelease, Integer> {
    @Override
    public void initialize(YearOfRelease constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer >= 1900 && integer <= 2050;
    }
}
