import java.util.*;

public class area {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter the radius of circle");
            float a = input.nextFloat();
            System.out.println("enter the length of rectangle");
            float l = input.nextFloat();
            System.out.println("enter the width og rectangle");
            float b = input.nextFloat();

            float area = (float) 3.14 * a * a;
            float area2 = (float) l * b;
            float permeter = (float) 2 * (l + b);
            System.out.println("the area of circle whose radius is\t" + a + "\t = " + area);
            System.out.println("the area of circle whose radius is\t" + l + "and" + b + "\t = " + area2);
            System.out.println("the area of circle whose radius is\t" + l + "and" + b + "\t = " + permeter);
            System.out.println("the area of circle whose radius is\t" + a + "\t = " + (int) area);
            System.out.println("the area of circle whose radius is\t" + l + "and" + b + "\t = " + (int) area2);
            System.out.println("the area of circle whose radius is\t" + l + "and" + b + "\t = " + (int) permeter);
        }
    }
}
