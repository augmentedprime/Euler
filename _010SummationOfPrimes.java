package euler;

public class _010SummationOfPrimes {
    
//    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//            Find the sum of all the primes below two million.
    
    
    
    public static boolean[] createPrimeIsFalseArray(){
        boolean[] prime_candidates = new boolean[2000000];
        prime_candidates[0] = true;
        prime_candidates[1] = true;
        
        
        for (int i=2; i<1000000; i++){
            for (int j=2; j*i<2000000; j++){
                if (prime_candidates[i] == false){
                prime_candidates[i*j] = true;
                }
            }
        }
        return prime_candidates;
    }
    
    public static long sumArrayElementsIfFalse(boolean[] array){
        long sum = 0;
        for (int i=0; i<array.length; i++){
            if (array[i] == false){
                sum += i;
            }
        }
        return sum;
    }
    
    public static void main(String[] args){
        boolean[] prime_candidates = createPrimeIsFalseArray();
        long answer = sumArrayElementsIfFalse(prime_candidates);
        System.out.println(answer);
    }
    
    
}
