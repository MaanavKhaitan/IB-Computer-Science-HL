
/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Factorial
{
    public static void main(String [] args){
        int a;
        System.out.print("Enter a number:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        int sum = 0;
        for (int i=1; i<=a; i++){
        int product = 1;
        for (int count = i;count >= 1; count--){
            product = product * count;
        }
        sum = sum + product;
    }
        System.out.println("The answer is " + sum);
}
}
