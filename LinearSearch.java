
/**
 * Write a description of class LinearSearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinearSearch
{
    public static void search(double[] numbers, double target) {
        boolean found = false;
        for (int i=0; i<numbers.length; i=i+1) {
            if (numbers[i] == target) {
                System.out.println(target + " found at position " + i + " in array.");
                found = true;
            }
        }
        if (found == false) {
            System.out.println(target + " not found in array.");
        }
    }
    
    public static void main(String[] args) {
        double value = 50;
        double[] N = {10,20,80,30,60,50,110,100,130};
        search(N, value);
    }
}
