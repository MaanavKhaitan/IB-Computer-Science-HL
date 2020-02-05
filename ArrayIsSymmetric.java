
/**
 * Write a description of class ArrayIsSymmetric here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ArrayIsSymmetric
{
    public static void main(String[] args) {
         int[] array;
         int I = 0;
         int J = 0;
         int X = 0;
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the size of the array: ");
         int N = in.nextInt();
         if (N % 2 == 0) {
             System.out.println("Works only with odd numbers (eg 3 5 7 ... ) ");
         }
         else {
             array = new int[N];
             for (I=0; I<N; I++) {
                 System.out.println("Enter the next element: ");
                 array[I] = in.nextInt();
             }
             I = (N/2)-1;
             J = (N/2)+1;
             while ((I>=0) && (J<N)) {
                 if (array[I] == array[J]) {
                     X++;
                 }
                 I = I-1;
                 J = J+1;
             }
             if (X==(N-1)/2) {
                System.out.println("Array is symmetric");
             }
             else {
                 System.out.println("Array is not symmetric");
             }
         }
    }
}
