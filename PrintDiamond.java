
/**
 * Write a description of class PrintDiamond here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PrintDiamond
{
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows (must be an odd number): "); // if number of rows is not odd, diamond cannot be formed
        int rows = in.nextInt(); // Number of rows in diamond
        rows = (rows/2)+1; // Number of rows in one pyramid in diamond
        for (int I=1;I<=rows;I++) {
            for (int J=1; J<=(rows-I); J++) {
                System.out.print(" ");
            }
            for (int K=1;K<=(2*I-1);K++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int I=rows-1;I>=1;I--) {
            for (int J=1; J<=(rows-I); J++) {
                System.out.print(" ");
            }
            for (int K=1;K<=(2*I-1);K++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
