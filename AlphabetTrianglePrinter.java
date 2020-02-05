
/**
 * Write a description of class AlphabetPyramidPrinter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AlphabetTrianglePrinter
{
    public static void main(String [] args) {
        System.out.println("Enter the number of rows: ");
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int index = 0;
        char letter = 'A';
        for (int I=1;I<=rows;I++) {
            for (int K=1;K<=I;K++) {
                System.out.print(letter);
                letter++;
            }
            System.out.println("");
        }
    }
}
