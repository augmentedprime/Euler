package euler;

import java.util.ArrayList;

public class _008LargestProductInASeries {
	
	/*
	 * 73167176531330624919225119674426574742355349194934
96983520312774506326239578318016984801869478851843
85861560789112949495459501737958331952853208805511
12540698747158523863050715693290963295227443043557
66896648950445244523161731856403098711121722383113
62229893423380308135336276614282806444486645238749
30358907296290491560440772390713810515859307960866
70172427121883998797908792274921901699720888093776
65727333001053367881220235421809751254540594752243
52584907711670556013604839586446706324415722155397
53697817977846174064955149290862569321978468622482
83972241375657056057490261407972968652414535100474
82166370484403199890008895243450658541227588666881
16427171479924442928230863465674813919123162824586
17866458359124566529476545682848912883142607690042
24219022671055626321111109370544217506941658960408
07198403850962455444362981230987879927244284909188
84580156166097919133875499200524063689912560717606
05886116467109405077541002256983155200055935729725
71636269561882670428252483600823257530420752963450
	 */

	
	public static ArrayList<Integer> numberAsArrayList(String num){
		int len = num.length();
		ArrayList<Integer> digits = new ArrayList<Integer>();
		
		for (int i=0; i<len; i++) {
			String currentNumber = num.substring(i, i+1);
			Integer parsedNumber = Integer.parseInt(currentNumber);
			digits.add(parsedNumber);
		}
		return digits;
	}
	
	
	public static long product(ArrayList<Integer> arrayList, int windowSize){
		long answer = 0;
		for (int i=0; i<=arrayList.size()-windowSize; i++){
			long temp = checkWindow(arrayList, i, i+windowSize);
			if (temp > answer) answer = temp;
		}
		return answer;
	}
	
	
	public static long checkWindow(ArrayList<Integer> arrayList, int startIndex, int endIndex){
		long product = 1;
		for (int j=startIndex; j<endIndex; j++){
			product *= arrayList.get(j);
		}
		return product;
	}
	
	
	public static void main(String[] args){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		String num = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		arrayList = numberAsArrayList(num);
		long answer = product(arrayList, 13);
		System.out.println(answer);
	}
		
		
		
		
		

	
	
//		int answer = 0;
//		
//		for (int i=0; i<nums.length()-12; i++) {
//			int temp = 1;
//			for (int j=i; j<i+13; j++) {
//				char c = nums.charAt(j);
//				int k = (int) c;
//				temp = temp * k;
//			}
//			if (temp > answer) {
//				answer = temp;
//			}
//		}
//		return answer;
//	}
//	
//		char[] chars = ("" + nums).toCharArray();
//		 	int temp = 0;
//		for (int i=0; i<chars.length-13; i++) {
//			int res = 1;
//			for (int j=i; j<i+13; j++){
//				res = res*chars[j];
//			}
//			if (res>temp) temp = res;
//		}
//		
//		return temp;
//	}
//	
//	public static void main(String[] args){
//		System.out.println(findLargestProduct());
//	}
}