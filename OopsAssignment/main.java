package OopsAssignment;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Choose the Below Option\n" + "1. Circle \n" + "2. Rectangle\n" + "3. Square");
        int i = sc.nextInt();
        switch (i) {
            case 1: {
                System.out.println("Please Enter the Radius of the Circle..");
                double r = sc.nextDouble();
                shape shape = new circle(r);
                shape.draw();
                System.out.println("Area of circle is : " + shape.size());
                break;
            }

            case 2: {
                System.out.println("Please Enter the Length and width of the rectangle..");
                double l = sc.nextDouble();
                double w = sc.nextDouble();
                shape shape = new rectangle(l, w);
                shape.draw();
                System.out.println("Area of rectangle is : " + shape.size());
                break;
            }

            case 3: {
                System.out.println("Please Enter the Length of the square..");
                double l = sc.nextDouble();
                shape shape = new square(l);
                shape.draw();
                System.out.println("Area of sequare is : " + shape.size());
                break;
            }
        }
    }
}
