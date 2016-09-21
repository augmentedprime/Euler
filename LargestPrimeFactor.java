package euler;

public class LargestPrimeFactor {
	//600851475143
	
	public static void main(String[] args){
		System.out.println(findPrimes());
	}
	
	public static int findPrimes(){
		long num = 600851475143L;
		//x = largest factor so far
		int factor = 1;
		
		for (int i=1; i<=num; i++) {
			if (num % i == 0) {
				num = num / i;
				factor = i;
			}
		}
		return factor;
	}
}
