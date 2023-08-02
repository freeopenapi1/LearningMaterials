package kr.co.himedia.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 파일에서 바이트 배열로 자료 읽기 -- 배열에 남아 있는 (쓰레기)자료가 있을 수 있음
public class FileInputStreamTest3 {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {

			int i;
			byte[] bs = new byte[10];
			while( (i = fis.read(bs)) != -1) {
//				for (byte b : bs)
//					System.out.print((char)b);
				for (int k=0; k<i; k++)
					System.out.print((char)bs[k]);
				System.out.println(" : " +i+ "바이트 읽음");
			}

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("end");
	}

}
















