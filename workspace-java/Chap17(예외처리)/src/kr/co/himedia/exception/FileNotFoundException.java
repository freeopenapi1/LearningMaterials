package kr.co.himedia.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFoundException {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("himedia1.txt");
			
			try {
				fis.close();
				System.out.println("here");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}
