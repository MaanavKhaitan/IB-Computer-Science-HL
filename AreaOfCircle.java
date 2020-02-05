
/**
 * Write a description of class AreaOfCircle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AreaOfCircle
{
    public static void main(String [] args) {
        final double Pi = 3.1415926535;
        double ratio = 0, area;
        while (ratio!=999){
            System.out.println("Enter the ratio of the circle. Enter 999 to exit: ");
            Scanner in = new Scanner(System.in);
            ratio = in.nextDouble();
            if (ratio == 999) {
                System.out.println("See you! ");
            } else {
                area = Pi * ratio * ratio;
                System.out.println("Area: " + area);
            }
        }
    }
}
