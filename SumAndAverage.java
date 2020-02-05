
/**
 * Write a description of class SumAndAverage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SumAndAverage
{
   public static void main(String [] args){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter two integer numbers: ");
       int a = in.nextInt();
       int b = in.nextInt();
       int sum = a + b;
       double average = (double) sum / 2;
       System.out.println("Sum: " + sum + "," + " Average: " + average);
   }
}
