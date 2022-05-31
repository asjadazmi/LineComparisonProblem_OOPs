package com.bridgelabz;
import java.util.Scanner;
public class LineComparison {
	static int x1,x2,y1,y2;
	static double length_of_the_line;
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of x1");
	x1=sc.nextInt();
    System.out.println("enter the value of x2");
	x2=sc.nextInt();
	System.out.println("enter the value of y1");
	y1=sc.nextInt();
	System.out.println("enter the value of y2");
	y2=sc.nextInt();
	
	showlinelength();
	}
	static void showlinelength( ) {
		 length_of_the_line=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println(length_of_the_line);
	}
	

	}
	