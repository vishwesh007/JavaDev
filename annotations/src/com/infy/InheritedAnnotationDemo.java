package com.infy;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@interface ChangeDetail2 {
	String authorName();

	String methodName();

	int id() default 1004;

}

@ChangeDetail2(authorName = "Sam" , methodName = "price")
class SmartPhone {
	String modelNo;
}

class Nokia2 extends SmartPhone {
	
}



class InheritedAnnotationDemo {

	public static void main(String[] args) {
		System.out.println("Super Class Annotation = " + new SmartPhone().getClass().getAnnotation(ChangeDetail2.class));
		System.out.println("Sub Class Annotation = " +  new Nokia2().getClass().getAnnotation(ChangeDetail2.class));
	}

}


