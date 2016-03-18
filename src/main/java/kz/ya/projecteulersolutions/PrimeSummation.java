/*
 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 Find the sum of all the primes below two million.
 */
package kz.ya.projecteulersolutions;

import java.util.ArrayList;

/**
 *
 * @author YERLAN
 */
public class PrimeSummation {

    public static void main(String[] args) {
        int N = 2 * 1000 * 1000;
        
        ArrayList<Long> primes = primesUnderSoE(N);
        
        // size
        System.out.println("Number of primes under " + N + ": " + primes.size());
        
        // sum primes
        long sum = 0;
        for (Long prime : primes) {
            sum += prime;
        }
        System.out.println("Sum of primes under " + N + ": " + sum);
    }
    
    /**
     * Find all prime numbers up to a specified number N using The Sieve of Eratosthenes algorithm
     * 
     * @param N Number
     * @return 
     */
    public static ArrayList<Long> primesUnderSoE(int N) {
        ArrayList<Long> primes = new ArrayList<>();
        
        // initially assume all integers are not prime
        boolean[] nonPrime = new boolean[N + 1];
        
        for (long p = 2; p <= N; p++) {
            // if non-prime, then continue
            if (nonPrime[(int) p]) {
                continue;
            }
            // add prime number to the list
            primes.add(p);
            // mark non-primes <= N
            for (long j = p * p; j <= N; j += p) {
                nonPrime[(int) j] = true;
            }
        }
        
        return primes;
    }
    
    /**
     * Find all prime numbers up to a specified number N using The Sieve of Atkin algorithm
     * 
     * @param N Number
     * @return 
     */
    public static ArrayList<Long> primesUnderSoA(int N) {
        ArrayList<Long> primes = new ArrayList<>();
        
        // initially assume all integers are not prime
        boolean[] nonPrime = new boolean[N + 1];
        
        for (long p = 2; p <= N; p++) {
            // if non-prime, then continue
            if (nonPrime[(int) p]) {
                continue;
            }
            // add prime number to the list
            primes.add(p);
            // mark non-primes <= N
            for (long j = p * p; j <= N; j += p) {
                nonPrime[(int) j] = true;
            }
        }
        
        return primes;
    }
}
