package kr.co.himedia.stream03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		
		try(fos) {
			byte[] bs = new byte[26];
			byte data = 65;			//'A'의 아스키 코드값 
			for(int i=0; i<bs.length; i++)
				bs[i] = data++;
			
			fos.write(bs); 			// 배열 한꺼번에 출력하기 
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println("출력이 완료되었습니다.");
	}
}











