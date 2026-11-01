package MyProfile;

class Area {
    public void squareArea(double side) {
        double area = side * side;
        System.out.println("Area of square: " + area);
    }

    public void rectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }

    public void circleArea(double radius) {
        final double pi = Math.PI;
        double area = pi * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

public class Area12 {
    public static void main(String[] args) {
        Area area = new Area();
        area.squareArea(5);
        area.rectangleArea(10, 5);
        area.circleArea(7);
    }
}