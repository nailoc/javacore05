package com.hk.app;

public class For3 {

	public static void main(String[] args) {
		//  특수한 for
		int x=1;
		for( ; ; ) { // 조건이 없으면 무조건 true
			System.out.println(x);
			x++;
			if(x==10000) {
				break;
			}
		}
		
		// 특수한 for 2
		int sum=0;
		for(int i=1, k=1; (sum<=100&&i==100); i+=2) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		// for문안에서 선언된 변수는 지역변수라고 하는데 
		// 반복문을 빠져나가면 지역변수도 소멸-사용안됨

	}

}
