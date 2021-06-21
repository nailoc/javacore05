package com.hk.app;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int total = 0;
		for(int i=1; i<=10; i++) {
			
			System.out.print(i+"번째 손님의 요금입력:");
			
			int fare = read.nextInt();
			
			total += fare;
		}
		
		System.out.println("오늘의 손님은 10명이고 총수입은:"+total );

	}

}
