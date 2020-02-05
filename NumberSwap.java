
/**
 * Write a description of class NumberSwap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NumberSwap
{
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping, first number: " + a + ", "+ "second number: "+b);
    }
}
