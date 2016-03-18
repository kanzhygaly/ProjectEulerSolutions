/*
 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 What is the 10 001st prime number?
 */
package kz.ya.projecteulersolutions;

import java.util.ArrayList;

/**
 *
 * @author YERLAN
 */
public class XstPrime {

    public static void main(String[] args) {
        
        // fast method the sieve of Eratosthenes
        long start = System.nanoTime();
        System.out.println(sieveOfEratosthenes(10001).get(10000));
        System.out.println("The sieve of Eratosthenes time: " + (System.nanoTime() - start));
        
        // typical method
        start = System.nanoTime();
        generatePrimes(10001);
        System.out.println("Typical method time: " + (System.nanoTime() - start));
    }
    
    private static boolean isPrime(int number) {
        boolean flag = true;
        for (int i = number; i > 1; i--) {
            if (number / i != 1 && number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    private static void generatePrimes(int N) {
        int counter = 0;
        for (int i = 2; i < N * 30; i++) {
            if (isPrime(i)) {
                counter++;
            }
            if (counter == N) {
                System.out.println(i);
                break;
            }
        }
    }
    
    /**
     * Generate N prime numbers using The Sieve of Eratosthenes algorithm
     * 
     * @param N Number of prime numbers to find
     * @return 
     */
    public static ArrayList<Long> sieveOfEratosthenes(int N) {
        ArrayList<Long> primes = new ArrayList<>();
        
        boolean[] nonPrime = new boolean[N * 30];
        
        for (long p = 2; primes.size() < N; p++) {
            if (nonPrime[(int) p]) {
                continue;
            }
            primes.add(p);
            for (long j = p * p; j < nonPrime.length; j += p) {
                nonPrime[(int) j] = true;
            }
        }
        return primes;
    }
}
