
/**
 * Write a description of class Find here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Find
{
    public static void find(int[] A, int target) {
        int pos = -1;
        boolean found = false;
        while ((!found)&&(pos<A.length-1)) {
            pos = pos + 1;
            found = (A[pos] == target);
        }
        if (found) {
            System.out.println(target + " is found at position " + pos);
        }
    }
    public static void main(String[] args) {
        int[] Numbers = {25,32,76,85,96,101};
        find(Numbers, 20);
    }
}
