package euler;

public class _010SummationOfPrimes {
    
//    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//            Find the sum of all the primes below two million.
    
    
    
    public static boolean[] createPrimeIsFalseArray(boolean[] array){
        array[0] = true;
        array[1] = true;
        for (int i=2; i<array.length/2; i++){
            if (array[i] == false){
                eliminate_Multiples(array, i);
            }
        }
        return array;
    }
    
    public static boolean[] eliminate_Multiples(boolean[] array, int index){
        for (int j=2; j*index<array.length; j++){
            array[index*j] = true;
        }
        
        
        return array;
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
        boolean[] array = new boolean[2000000]; 
        boolean[] prime_candidates = createPrimeIsFalseArray(array);
        long answer = sumArrayElementsIfFalse(prime_candidates);
        System.out.println(answer);
    }
    
    
}
