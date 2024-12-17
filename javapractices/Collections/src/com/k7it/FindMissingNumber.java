package com.k7it;

import java.util.Arrays;

public class FindMissingNumber {
	public static int findMissingNumber(int[] numbers, int n) {
	int expectedSum=n*(n+1)/2;
	int actualSum=Arrays.stream(numbers).sum();
	return (expectedSum-actualSum);
		
	}

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6,8,9,10};
		int n=10;
		int missingNumber=findMissingNumber(numbers,n);
		System.out.println("MissingLetter:"+missingNumber);
		
	}

}
