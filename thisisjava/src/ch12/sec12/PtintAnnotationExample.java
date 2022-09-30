package ch12.sec12;

import java.lang.reflect.Method;

public class PtintAnnotationExample {
	public static void main(String[] args) {
      Method[] declaredMethods = Service.class.getDeclaredMethods();
	for(Method method:declaredMethods)	{
		PrintAnnotation printAnnotation 
		        = method.getAnnotation(PrintAnnotation.class);
		printLine(printAnnotation);
		
	}
        
	}
	
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation !=null) {
			int number = printAnnotation.number();
			for(int i=0;i<number;i++) {
				String value=printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
