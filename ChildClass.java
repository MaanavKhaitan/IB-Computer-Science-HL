
/**
 * Write a description of class ChildClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class ChildClass extends ParentClass
{
    public void print_hello() {
        //super.print_hello();
        System.out.println("Child class");
    }
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.print_hello();
    }
}
