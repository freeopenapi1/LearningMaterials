package kr.co.himedia.string;

public class StringTest03 {

	public static void main(String[] args) {
		String java = new String("java");
		String kotlin = new String("kotlin");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(kotlin);
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
	}
}
