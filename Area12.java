package MyProfile;

import java.util.Scanner;

class Area{
	public void squarearea(double A) {
	double	b=A*A;
	System.out.println("Enter of squre"+b);
	}
	public void modearea(double length,double breadth) {
		double c=length*breadth;
		System.out.println("Enter of rectangle"+c);
	}
	 public void circleArea(double r) {
		 double pi=3.14;
		 double S=(r*r)*pi;
		 System.out.println("Enter Area of circle"+S);
	}
}
public class Area12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area A=new Area();
		A.squarearea(5);      // Square
        A.modearea(10, 5);    // Rectangle
        A.circleArea(7);      // circle
	}

}
