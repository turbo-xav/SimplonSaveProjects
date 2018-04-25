package annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface InfoClasse {

	String auteur();
    int revision() default 1;
    String[] references();
    
}
