package edu_Annotation;

import java.lang.reflect.Method;

public class Annotation_Action {
	
	
	public static void main(String[] args) {
	
		Annotation_exam1 ae = new Annotation_exam1();
		
			try {
				Method method = ae.getClass().getDeclaredMethod("hello");
				
				if (method.isAnnotationPresent(Count100.class)) {
					for(int i = 0 ; i< 100; i++) {
						ae.hello();
					}
				}else {
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
		
		
	}

