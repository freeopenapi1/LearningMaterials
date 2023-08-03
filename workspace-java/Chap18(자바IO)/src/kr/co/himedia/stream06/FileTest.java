package kr.co.himedia.stream06;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		File directory = new File("C:/Temp1/himedia");
		File file1 = new File("C:/Temp1/file1.txt");
		File file2 = new File("C:/Temp1/file2.txt");
		
		if (directory.exists() == false) {
			directory.mkdirs();
		}
		
		if (file1.exists() == false) {
			file1.createNewFile();
			System.out.println("file1.txt가 생성되었습니다.");
		}
		
		if (file2.exists() == false) {
			file2.createNewFile();
			System.out.println("file2.txt가 생성되었습니다.");
		}
		
		//C:\workspace-java 서브 디렉토리와 파일들을 출력하시오
		File temp = new File("C:/workspace-java/Chap18(자바IO)");
		File[] files = temp.listFiles();
		
		System.out.println("날짜 \t 시간  \t\t  크기  \t\t   이름 ");
		System.out.println("---------------------------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file : files) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			
			if(file.isDirectory()) {
				System.out.println("\t <DIR>\t\t" + file.getName());
			} else {
				System.out.println("\t" +file.length()+ "\t\t" + file.getName());
			}
			
			System.out.println();
		}
		
	}
}




















