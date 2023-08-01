package kr.co.himedia.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFoundException2 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("himedia.txt");
			
			
			

		} catch (java.io.FileNotFoundException e) {
			e.printStackTrace();
			
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("finally 블록은 항상 수행");
		}
		
		System.out.println("end");
	}

}

















