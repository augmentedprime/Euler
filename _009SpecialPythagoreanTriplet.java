package euler;

public class _009SpecialPythagoreanTriplet {
//    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//    a2 + b2 = c2
//    For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//    Find the product abc.
    
    /* 
     * this translates to:
     * find a*b*c where 
     * a^2 + b^2 = c^2 (is pythagorean triplet)
     * a + b + c = 1000
     */
    
    
    public static boolean isPythagoreanTriplet(int a, int b, int c){
        if (a < 1 || b < 1 || c < 1) {
            return false;
        } else return (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2));
    }
    
    public static boolean isSum1000(int a, int b, int c){
        return (a + b + c == 1000);
    }
    
    public static int iterateABC(){
        for(int a=1; a<1000; a++){
            for(int b=1; b<1000; b++){
                for(int c=1; c<1000; c++){
                    if (isPythagoreanTriplet(a, b, c) &&
                            isSum1000(a, b, c)){
                        System.out.println(a + " * " + b + " * " + c + " =");
                        return a * b * c;
                    }
                }
            }
        }
        return 0;
    }
    
    public static void main(String[] args){
        int answer = iterateABC();
        System.out.println(answer);
    }
}
