package com.madebyatomicrobot.sumtype.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This can only be applied to interfaces!
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface SumType {
}
