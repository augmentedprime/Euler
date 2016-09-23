package euler;

public class _005SmallestMultiple {
	
	/*
	 * 2520 is the smallest number that can be divided by
	 * each of the numbers from 1 to 10 without any remainder.
	 * 
	 * What is the smallest positive number that is evenly divisible
	 * by all of the numbers from 1 to 20?
	 */
	
	/*
	 * 20, 10, 5, 4, 2
	 * 19
	 * 18, 9, 6, 3, 2
	 * 17
	 * 16, 8, (2)
	 * 15, 5, 3
	 * 14, 7, (2)
	 * 13
	 * 12, 6
	 * 11
	 * 
	 * only need to do 11-20 because that would prove the smaller ones also
	 */
	
	public static boolean compositeCheck(int x){
		for (int i=11; i<=20; i++)
			if (x % i != 0) return false;
		return true;
	}
	
	public static int findMultiple(){
		for (int i=1; true; i++){
			if (compositeCheck(i)) return i;
		}
	}
	
	
	public static void main(String[] args){
		System.out.println(findMultiple());
	}
	
	
	
}
