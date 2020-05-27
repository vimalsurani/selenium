package testing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectionAPI1 {

	/**
	 * @param args
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		reflectionAPI1 reflectapi=new reflectionAPI1();

		Method method[]=reflectapi.getClass().getMethods();
		for (int i=0;i<method.length;i++){
			if(method[i].getName().equals("method2")){
				method[i].invoke(reflectapi);
			}

		}

	}
	
	public void method1(){
		System.out.println(" Calling Method 1");
	}
	
	public void method2(){
		System.out.println(" Calling Method 2");
	}
	
	public void method3(){
		System.out.println(" Calling Method 3");
	}
	
	public void method4(){
		System.out.println(" Calling Method 4");
	}
	
	public void method5(){
		System.out.println(" Calling Method 5");
	}

}
