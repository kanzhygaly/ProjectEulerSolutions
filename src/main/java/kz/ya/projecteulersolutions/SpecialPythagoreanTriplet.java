/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which, a^2 + b^2 = c^2 For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2. There
 * exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the
 * product abc.
 */
package kz.ya.projecteulersolutions;

/**
 *
 * @author YERLAN
 */
public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {
        outerloop: for (int a = 1; a <= 1000; a++) {
            for (int b = 1; b <= 1000; b++) {
                double c = Math.sqrt(a * a + b * b);
                if ((a + b + c) == 1000.0) {
                    System.out.println(a + " + " + b + " + " + (int) c + " = " + (a + b + (int) c));
                    System.out.println(a + " * " + b + " * " + (int) c + " = " + (a * b * (int) c));
                    break outerloop;
                }
            }
        }
    }
}
