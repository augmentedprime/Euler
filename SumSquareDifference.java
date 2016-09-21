package euler;

import java.lang.Math;

public class SumSquareDifference {
 /*
The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the 
first ten natural numbers and the square of the sum is 3025 - 385 = 2640.

Find the difference between the sum of the squares of the first one hundred 
natural numbers and the square of the sum.
  */
	
	public static int sumOfSquares(int first, int last){
		int res = 0;
		for (int i=first; i<=last; i++){
			res += Math.pow(i, 2);
		}
		return res;
	}
	
	public static int squareOfSum(int first, int last){
		int res = 0;
		for (int i=first; i<=last; i++){
			res += i;
		}
		return (int) Math.pow(res, 2);
	}
	
	public static int squareSumMinusSumSquare(int first, int last){
		int sumSquare = sumOfSquares(first, last);
		int squareSum = squareOfSum(first, last);
		return squareSum - sumSquare;
	}
	
	public static void main(String[] args){
		int first = 1;
		int last = 100;
		
		System.out.println(squareSumMinusSumSquare(first, last));
	}
}
