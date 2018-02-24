package com.github.slamdunk.javabase.anotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * a customed anotation
 * 
 * @Target：
 * 
 * Indicates the contexts in which an annotation type is applicable.，the value
 * can be one of these ：
 * 
 * ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE,
 * ElementType.METHOD, ElementType.PACKAGE, ElementType.PARAMETER,
 * ElementType.TYPE
 * 
 * @Retention Indicates how long annotations with the annotated type are to be
 *            retained, the value can be one of these： RetentionPolicy.SOURCE,
 *            RetentionPolicy.CLASS, RetentionPolicy.RUNTIME
 * 
 * @author liuzhongda
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnotation {
	String valueStr() default "abc";

	MyEnum valueEnum() default MyEnum.Sunny;

	String[] valueArray() default "helloworld";
}
