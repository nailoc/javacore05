package com.hk.app;

public class DoDo {

	public static void main(String[] args) {
		
		// Do while 문을 써서 
		// ★★★★★
		// ★★★★★
		// ★★★★★
		// ★★★★★
		// ★★★★★ 
		// 출력하시오
		
		int r=0;
		do {
			int c=0;
			do {
				System.out.print("★");
				c++;
			}while(c<5);
			System.out.println();
			r++;
		}while(r<5);
		
		// for : 반복되는 회수가 정해진 경우
		// while: 여러조건이나 무한루프를 돌리는 경우
		// do while: 반드시 실행이 필요한 경우

	}

}
