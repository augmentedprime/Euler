package euler;

public class _002EvenFibonacciNumbers {
	
	public static int getFibsUpTo4Million() {
		
		//second to last
		int a = 0;
		//last fib already generated
		int b = 1;
		//new fib
		int c = 0;
		int sum = 0;
		
		
		while (c < 4000000) {
			 if (c % 2 == 0){
				 sum = sum + c;
			 }
			 c = a + b;
			 a = b;
			 b = c;
		}
		return sum;
	}
	
	public static void main(String[] args){
		int answer = getFibsUpTo4Million();
		System.out.println(answer);
	}
}
