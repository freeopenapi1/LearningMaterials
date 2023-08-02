package kr.co.himedia.exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionTest {

	public Class loadClass(String fileName, String className) 
			throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class clazz = Class.forName(className);
		return clazz;
	}
	
	public static void main(String[] args) {
		ThrowsExceptionTest test = new ThrowsExceptionTest();
		
		try {
			test.loadClass("himedia.txt", "java.lang.String1");
			
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("FileNotFoundException : " + e.getMessage());
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("ClassNotFoundException : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
		
		System.out.println("end");
		
	}
}






























