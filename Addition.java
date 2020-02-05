
/**
 * Write a description of class Addition here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Addition
{
   public static void main(String [] args){
       int a,b;
       int q = 0;
       System.out.println("Enter two numbers:");
       Scanner in = new Scanner(System.in);
       a = in.nextInt();
       b = in.nextInt();
       q = a + b;
       System.out.println("The sum is " + q);
   }
}
