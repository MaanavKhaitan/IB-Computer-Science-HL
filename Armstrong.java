

/**
 * Checks whether number entered is an Armstrong Number.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
import java.util.Scanner;
public class Armstrong
{
    public static void main(String [] args){
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        double sum = Math.pow((i%10),3) + Math.pow((i/10)%10,3) + Math.pow(((i/10)/10)%10,3);
        if (sum == i) {
            System.out.println("This is an Armstrong number.");
        } else {
            System.out.println("This is not an Armstrong number.");
        }    
    }
}
