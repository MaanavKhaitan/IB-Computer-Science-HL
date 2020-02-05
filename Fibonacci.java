
/**
 * Write a description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Fibonacci
{
    public static void main(String [] args)
    {
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 1;
        int previous = 0;
        System.out.println(1);
        for (int count = 1; count<=a; count++){
            int b = sum;
            sum = sum+previous;
            previous = b;
            System.out.println(sum);
        }
    }
}
