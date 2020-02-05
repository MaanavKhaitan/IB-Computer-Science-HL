
/**
 * Write a description of class QuotientRemainder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class QuotientRemainder
{
    public static void main(String [] args) {
        int a, b, q=0, r=0;
        System.out.println("Enter two positive integers: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        q = a / b;
        r = a % b;
        final double Pi = 3.142;
        System.out.println("Quotient: " + q + "," + " Remainder: " + r);
    }
}
