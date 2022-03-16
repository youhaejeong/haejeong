package com.prod;

public class ArrayExample6 {
	public static void main(String[] args) {
		int[] numbers = { 358, 22, 17, 40, 28, 33, 36 };
		// 배열의 값이 30보다 크로 40보다 작으 값의 합,평균
		int sum =0;
		int cnt = 0;
		for(int i =0; i < numbers.length; i++ ) {
			if(30<=numbers[i] && numbers[i]<=40) {
				sum +=numbers[i];
				cnt++;
			}
		}
		System.out.println("30~40사이의 합은 " + sum);
		System.out.printf("30~40사이의 평균은: %.3f ", (sum / (double)cnt));

	}

}
