package kr.co.himedia.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFoundException3 {
	
	public static void main(String[] args) {
		
				
		try(FileInputStream fis = new FileInputStream("himedia.txt") ) {
			
			System.out.println("read");

		} catch (IOException e) {
			e.printStackTrace();
			
		} 		
		System.out.println("end");
	}

}

















