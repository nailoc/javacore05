package com.hk.app;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		
		// 10명이 아니라 총수입 120000원 넘으면 
		// 택시영업을 마치겠다  이런 경우 몇명을 태웠고
		// 총수입은 얼마인가?
		
		Scanner reader = new Scanner(System.in);
		int i=0;    //손님수
		int total=0; //총수입
		while(true) {
			i++;
			System.out.print(i+"번째 손님의 요금은:");
			int fare = reader.nextInt();
			total = total+fare;
			
			if(total>=120000) {
				break; // 총수입이 120000이상이면 stop
			}
		}
		System.out.println("오늘의 총손님수:"+i);
		System.out.println("오늘의 총수입은:"+total);

	}

}
