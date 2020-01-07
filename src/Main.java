import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        Rectangle object = new Rectangle();
        object.setDimensions(10, 5);
        System.out.println("The area of our rectangle is: " + object.getArea());

    }
}
