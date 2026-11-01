package MyProfile;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Demo {
    public static void main(String[] args) {
        Shape first = new Circle();
        Shape second = new Rectangle();

        first.draw();
        second.draw();
    }
}