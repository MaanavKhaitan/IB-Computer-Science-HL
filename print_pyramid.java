
/**
 * Prints a pyramid of asterisks.
 * 
 * @author (Maanav Khaitan) 
 * @version (1.0)
 */
public class print_pyramid
{
    public static void main (String [] args) {
        for (int I=1;I<=69;I++) {
            for (int J=1; J<=(69-I); J++) {
                System.out.print(" ");
            }
            for (int K=1;K<=(2*I-1);K++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
