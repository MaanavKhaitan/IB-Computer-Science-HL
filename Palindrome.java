
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Palindrome
{
    public static void main(String [] args) {
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int original_num = num;
        int reverse_num = 0, remainder = 0;
        while (num != 0) {
            remainder = num % 10;
            reverse_num = (reverse_num*10) + remainder;
            num /= 10;
        }
        if (reverse_num == original_num) {
            System.out.println(original_num + " is a palindrome.");
        } else {
            System.out.println(original_num + " is not a palindrome.");
        }
    }
}
