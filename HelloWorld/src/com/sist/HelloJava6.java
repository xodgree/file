package com.sist;
import java.util.Scanner;
//import => ������ ������� Ŭ������ �����´�.

public class HelloJava6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kor,eng,math,total;
		System.out.print("��������:");
		kor = scan.nextInt();
		System.out.println("kor="+kor);
		
		System.out.print("��������:");
		eng = scan.nextInt();
		System.out.println("eng="+eng);
		
		System.out.print("��������:");
		math = scan.nextInt();
		System.out.println("math="+math);
		
		total = kor+eng+math;
		System.out.println("����:"+total);
		
		scan.close();
	}

}
