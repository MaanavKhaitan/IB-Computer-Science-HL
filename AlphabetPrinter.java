
/**
 * Write a description of class AlphabetPrinter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AlphabetPrinter
{
    public static void main(String [] args) {
        System.out.println("Uppercase letters:");;
        for (char upper_letter ='A';upper_letter<='Z';upper_letter++) {
            System.out.println(upper_letter);
        }
        System.out.println("Lowercase letters:");
        for (char lower_letter = 'a'; lower_letter <= 'z'; lower_letter++) {
            System.out.println(lower_letter);
        }
    }
}
