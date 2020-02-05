
/**
 * Write a description of class Remainder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Remainder
{
    public static void main(String [] args) {
        int a,b;
        int q = 0;
        System.out.println("Enter the two positive numbers:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        q = a%b;
        System.out.println("Remainder is " + q);
    }
}
