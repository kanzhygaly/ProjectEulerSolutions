/*
 The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... + 10^2 = 385
 The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)^2 = 55^2 = 3025
 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
package kz.ya.projecteulersolutions;

/**
 *
 * @author YERLAN
 */
public class SumSquareDifference {

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(squareOfTheSums(100) - sumOfTheSquares(100)); // 25164150
        System.out.println("Time: " + (System.nanoTime() - start));
        start = System.nanoTime();
        System.out.println(squareOfTheSums(100) - fastSumOfTheSquares(100)); // 25164150
        System.out.println("Time: " + (System.nanoTime() - start));
    }

    private static long sumOfTheSquares(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    private static long squareOfTheSums(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum * sum;
    }

    private static long fastSumOfTheSquares(int n) {
        if (n < 2) {
            return n;
        }
        return n * n + fastSumOfTheSquares(n - 1);
    }
}
