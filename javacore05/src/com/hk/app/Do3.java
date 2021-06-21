package com.hk.app;

public class Do3 {

	public static void main(String[] args) {
		// do while 문을 사용하여 
		// 1~100까지 합을 구하시오
		int i=1;
		
		int sum=0;
		do {			
			sum=sum+i; // 0+1 => 1로 대입 1+2 => 3 대입
			i++;
		}while(i<=100);
		
		System.out.println("총합은:"+sum);
		
		

	}

}
