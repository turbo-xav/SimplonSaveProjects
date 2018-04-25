package co.projetWeb.Application.Controller.Annotation;

import java.util.Comparator;

public class ComparatorControllerMethodAnnotation implements Comparator<ControllerMethodAnnotation> {
	
	/**
	  * Compare 2 ControllerMethodAnnotation according to their specified orders (1, 2, 3 , ....)
	  *
	  * @access public
	  * @name  compare
	  * @param ControllerMethodAnnotation : first annotation to compare
	  * @param ControllerMethodAnnotation : second annotation to compare
	  * 
	  */
	
	
	public int compare(ControllerMethodAnnotation s1, ControllerMethodAnnotation s2){
               
        if(s1.order() < s2.order()) { return -1; } 
        if(s1.order() > s2.order()) { return 1; } 
        return 0;
		
	}      
}
