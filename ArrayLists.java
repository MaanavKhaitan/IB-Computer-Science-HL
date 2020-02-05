
/**
 * Write a description of class ArrayLists here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import java.util.*; 
public class ArrayLists
{
    public static void main(String[] args) {
        ArrayList<Integer> arrli = new ArrayList<Integer>(10);
        // Initialize ArrayList with values
        arrli.add(5);
        arrli.add(7);
        arrli.add(20);
        
        ArrayList<Integer> second_arrli = new ArrayList<Integer>(10);
        second_arrli.add(11);
        second_arrli.add(2);
        second_arrli.add(8);
        
        arrli.addAll(1, second_arrli);
        System.out.println(arrli);
    }
}

