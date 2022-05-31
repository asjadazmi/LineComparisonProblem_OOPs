package com.bridgelabz;
import java.util.Scanner;
public class LineComparison {
	   public static void main(String[] args) {
           int x1, x2, x3, x4, y1, y2, y3, y4;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the value x1 ");
           x1 = sc.nextInt();
           System.out.println("enter the value of x2");
           y1 = sc.nextInt();
           System.out.println("enter the value of y1");
           x2 = sc.nextInt();
           System.out.println("enter the value of y2");
           y2 = sc.nextInt();

           System.out.println("Enter the value x3");
           x3 = sc.nextInt();
           System.out.println("enter the value of y3");
           y3 = sc.nextInt();
           System.out.println("enter the value of x4");
           x4 = sc.nextInt();
           System.out.println("enter the value of y4");
           y4 = sc.nextInt();

           Equality(x1, x2, x3, x4, y1, y2, y3, y4);
   }
	static double Equality (int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        double a, b;

        a = (double) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        b = (double) Math.sqrt((x4 - x3)*(x4-x3) + (y4 - y3)*(y4-y3));

        if (a == b) {
            System.out.println("Both lines are equal.");
        }
        else {
            System.out.println("Both lines are not equal.");
        }
        return 0;
    }

     
}