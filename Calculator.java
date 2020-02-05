
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.Math;
public class Calculator
{
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Choose your operation:\n- Addition (add)\n- Subtraction (sub)\n- Multiplication (mul)\n- Division (div)\n- Square Root (sqrt)\n- Power (pow)\n- Remainder (mod)");
        String operation = in.next();
        if (operation.equals("add")){
            System.out.println("Sum is: " + (a+b));
        }
        if (operation.equals("sub")){
            System.out.println("Difference is: " + (a-b));
        }
        if (operation.equals("mul")){
            System.out.println("Product is: " + (a*b));
        }
        if (operation.equals("div")){
            System.out.println("Quotient is: " + (a/b));
        }
        if (operation.equals("sqrt")){
            System.out.println("Square root of " + a + " is: " + Math.sqrt(a));
        }
        if (operation.equals("pow")){
            System.out.println("Power of " + a + " to " + b + " is: " + Math.pow(a,b));
        }
        if (operation.equals("mod")){
            System.out.println("Remainder is: " + (a%b));
        }
    }
}
