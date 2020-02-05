
/**
 * Write a description of class Scope here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scope
{
    int n = 1; // Global Variable
    public static void main(String [] args){
        int n=1;
        while (n<=5) {
            int m = n; // Local Variable
            System.out.println("value of m is " + m);
            System.out.println("value of n is " + n);
            n++;
        }
        System.out.println("value of n is " + n);
    }
}
