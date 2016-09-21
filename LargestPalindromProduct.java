package euler;

public class LargestPalindromProduct {
	
	
	public static String reverseString(int x){
		String forward = Integer.toString(x);
		String reverse = "";
		for (int i=forward.length()-1; i>=0; i--){
			reverse = reverse + forward.substring(i, i+1);
		}
		return reverse;
	}
	
	public static boolean isPalindrome(int x){
		String forward = Integer.toString(x);
		String reverse = reverseString(x);
		
		return (forward.equals(reverse));
	}
	
	public static int findPal(){
		int storeI = 0;
		int storeJ = 0;
		int biggestPal = 0;
		for (int i=100; i<1000; i++){
			for (int j=100; j<1000; j++){
				if (isPalindrome(i * j) && (i * j) > biggestPal){
					biggestPal = i * j;
					storeI = i;
					storeJ = j;
				}
			}
		}
		System.out.println(storeI);
		System.out.println("*");
		System.out.println(storeJ);
		System.out.println("=");
		return biggestPal;		
	}
	
	
	public static void main(String[] args){
		int answer = findPal();
		
		System.out.println(answer);
	}
}
