
/**
 * Performs various operations on a 2-dimensional array.
 *
 * @author (Maanav Khaitan)
 * @version (1.0)
 */
public class TwoDArray
{
    public static void main(String[] args) {
        int[][] a = {{5,8,9,12},{6,17,12,10},{5,7,1,3}};
        int sum = 0;
        int product = 1;
        int max = a[0][0];
        int min = a[0][0];
        for (int i=0;i<a.length;i++) {
            for (int j=0; j<a[0].length;j++) {
             System.out.println(a[i][j]);
             sum = sum + a[i][j];
             product = product * a[i][j];
             if (a[i][j] > max) {
                 max = a[i][j];
             }
             if (a[i][j] < min) {
                 min = a[i][j];
             }
            }
        }
        System.out.println("Sum is " + sum);
        System.out.println("Product is " + product);
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }
}
