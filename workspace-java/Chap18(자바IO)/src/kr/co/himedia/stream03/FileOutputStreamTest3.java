package kr.co.himedia.stream03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output3.txt");
		
		try(fos) {
			byte[] bs = new byte[26];
			byte data = 65;			//'A'의 아스키 코드값 
			for(int i=0; i<bs.length; i++)
				bs[i] = data++;
			
			fos.write(bs, 2, 10); 			// 배열의 2번째 위치부터 10개 바이트 출력하기 
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println("출력이 완료되었습니다.");
	}
}











