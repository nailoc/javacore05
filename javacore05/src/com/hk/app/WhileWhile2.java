package com.hk.app;

public class WhileWhile2 {

	public static void main(String[] args) {
		
		// 구구단 1-3단까지 출력하시오
		int dan = 1;
		while(dan<=3) {
			
			int c = 1;
			while(c<10) {
				System.out.println(dan + "*" + c + "=" +dan*c);
				c++;
			}
			System.out.println();
			dan++; // 4가 되면 외부의 반복while 멈춤
		}

	}

}
