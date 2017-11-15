package com.sist;
import java.util.Scanner;
//import => 기존에 만들어진 클래스를 가져온다.

public class HelloJava6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kor,eng,math,total;
		System.out.print("국어점수:");
		kor = scan.nextInt();
		System.out.println("kor="+kor);
		
		System.out.print("영어점수:");
		eng = scan.nextInt();
		System.out.println("eng="+eng);
		
		System.out.print("수학점수:");
		math = scan.nextInt();
		System.out.println("math="+math);
		
		total = kor+eng+math;
		System.out.println("총점:"+total);
		
		scan.close();
	}

}
