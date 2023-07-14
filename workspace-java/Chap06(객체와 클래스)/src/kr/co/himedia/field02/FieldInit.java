package kr.co.himedia.field02;

import java.util.Arrays;

public class FieldInit {
	//기본형 변수
	byte byteField;			//1 byte
	short shortField;		//2
	int intField;			//4
	long longField;			//8
	
	boolean booleanField;	//1
	char charField;			//2
	
	float floatField;		//4
	double doubleField;		//8
	
	//참조형 변수
	int[] arrField;			//4
	String strField;		//4
	
	/*
	 * 클래스 멤버변수(필드)의 값들을 수시로 확인하고자 할때나,
	 * 원하는 포맷으로 멤버변수들을 출력하고자 할때 많이 사용
	 */
	@Override
	public String toString() {
		return "FieldInit [byteField=" + byteField + ", shortField=" + shortField + ", intField=" + intField
				+ ", longField=" + longField + ", booleanField=" + booleanField + ", charField=" + charField
				+ ", floatField=" + floatField + ", doubleField=" + doubleField + ", arrField="
				+ Arrays.toString(arrField) + ", strField=" + strField + "]";
	}
	
	
}











