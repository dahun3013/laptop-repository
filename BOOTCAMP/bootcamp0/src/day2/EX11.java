package day2;

import java.util.Scanner;

public class EX11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 문제 11
		System.out.print("키 입력(cm): ");
		int tall = sc.nextInt();
		System.out.print("몸무게 입력(kg): ");
		double kg = sc.nextDouble();
		if(kg<=(tall-100)*0.9) {
			System.out.println("정상");
		}else
			System.out.println("비만");

	}
}
