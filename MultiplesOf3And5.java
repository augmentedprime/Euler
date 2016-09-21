package euler;

import java.util.HashSet;
import java.util.Set;

public class MultiplesOf3And5 {
	
	//sort of verbose solution involving a HashSet to git rid of duplicates
		
		public static void main(String[] args){
			
			Set<Integer> multiples = new HashSet<Integer>();
			
			int sum = 0;
			

		for (int i=0; i<1000; i++){
			if (i % 3 == 0) multiples.add(i);
			if (i % 5 == 0) multiples.add(i);
		}
		
		for (Integer currentNum : multiples){
			sum = sum + currentNum;
		}
		System.out.println(sum);
		int otherSum = other(); 
		System.out.println(otherSum);
		}
		
		//the more succint code, probably just hands down better.
		//prints beneath the other code
		public static int other(){
			int summ = 0;
			for (int i=0; i<1000; i++){
				if (i % 3 == 0 || i % 5 ==0){
					summ = summ + i;
				}
			}
			return summ;
		}
}
