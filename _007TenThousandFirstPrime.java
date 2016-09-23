package euler;

public class _007TenThousandFirstPrime {
	
	public static int findNthPrime(int n){
		int count = 2;
		int num = 0;
		
		if (n == 1) return 2;
		if (n == 2) return 3;
		
		//check numbers until you get to the nth prime
		for (int i=1; count<n; i+=2){
			num = i;
			//for each number, check if divisible by any other number
			for (int j=2; j<=i/2; j++){
				if (i % j == 0) break;
				else if (j == i/2) count++;
			}
		}
		return num;
	}
	
	public static void main(String[] args){
		System.out.println(findNthPrime(10001));
	}
}
