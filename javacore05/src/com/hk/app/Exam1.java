package com.hk.app;

public class Exam1 {

	public static void main(String[] args) {
		
		int sum=0;
		int sum2=0;
		
		for(int i=1; i<=100; i++) {
			
			if(i%2==0) { // 짝수이면
				sum = sum + i;
			}else {
				sum2 = sum2 + i;
			}
		}
		
		System.out.println("짝수의 합은:"+sum);
		System.out.println("홀수의 합은:"+sum2);
		System.out.println("총합:"+(sum+sum2));

	}

}
