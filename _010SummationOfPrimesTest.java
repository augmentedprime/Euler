package euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class _010SummationOfPrimesTest {

    @Test
    public void test() {
        boolean[] prime_candidates = _010SummationOfPrimes.createPrimeIsFalseArray();
        assertEquals(prime_candidates[0], true);
        assertEquals(prime_candidates[1], true);
        assertEquals(prime_candidates[2], false);
        assertEquals(prime_candidates[3], false);
        assertEquals(prime_candidates[4], true);
        assertEquals(prime_candidates[5], false);
        assertEquals(prime_candidates[6], true);
        assertEquals(prime_candidates[7], false);
        assertEquals(prime_candidates[1000033], false);
        assertEquals(prime_candidates[1000032], true);
        assertEquals(prime_candidates[1000003], false);
        assertEquals(prime_candidates[1000002], true);
        assertEquals(prime_candidates[1999993], false);
    }

}
