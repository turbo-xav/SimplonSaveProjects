package co.projetweb.application.controller.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface ControllerMethodAnnotation {
	String   name();
	String   lib();
	int 	 order();
	boolean bdd();
}