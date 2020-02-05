
/**
 * Write a description of class Home here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Methods
{
    // instance variables - replace the example below with your own
    public static int Add(int x, int y) {
        int c = x+y;
        return c;
    }
    public static void areaR(int length, int breadth) {
        int area = length*breadth;
        System.out.println(area);
    }
    public static void main(String[] args) {
        int result = Add(5,6);
        System.out.println("Sum: " + result);
        areaR(5,6);
    }
}
