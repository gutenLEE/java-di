package com.interface21.beans.factory.annotation;

import java.lang.annotation.*;

@Target({
    ElementType.CONSTRUCTOR,
    ElementType.METHOD,
    ElementType.PARAMETER,
    ElementType.FIELD,
    ElementType.ANNOTATION_TYPE
})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowired {}
