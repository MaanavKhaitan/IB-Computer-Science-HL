
/**
 * Write a description of class ar1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ar1
{
  public static void main(String[] args) {
      Account[] obj = new Account[2];
      obj[0]=new Account();
      obj[1] = new Account();
      obj[0].setData(1,2);
      obj[1].setData(3,4);
      System.out.println("For array element 0");
      obj[0].showData();
      System.out.println("For array element 1");
      obj[1].showData();
      
  }
}
