package com.sist;

public class HelloJava5 {
	//프로그램의 시작과 종료(main)
	public static void main(String[] args) {
		byte byte_value = 127;
		short short_value = 32767;
		int int_value = 2140000000;
		long long_value = 2140000000L;
		int kor = 90, eng = 78;
		
		System.out.println("국어:"+kor);
		System.out.println("영어:" + eng);
		System.out.println("byte_value=" + byte_value);
		System.out.println("short_value=" + short_value);
		System.out.println("int_value=" + int_value);
		System.out.println("long_value=" + long_value);
		
		System.out.println(7+8+"5");
		System.out.println("7"+8*10);
		
	}
}
