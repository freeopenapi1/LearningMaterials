package kr.co.himedia.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//파일에서 바이트 배열로 offset(시작점)에서 length만큼 자료 읽기 
public class FileInputStreamTest4 {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {

			int i;
			byte[] bs = new byte[10];
			while( (i = fis.read(bs, 0, 9)) != -1) {
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
















