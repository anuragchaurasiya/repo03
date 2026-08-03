package MyProfile;

class shape2 {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class circle extends shape2 {
    @Override
    void draw() {
        System.out.println("Area of circle");
    }
}

class rectangle extends shape2 {
    @Override
    void draw() {
        System.out.println("Area of rectangle");
    }
}

public class Demo {

    public static void main(String[] args) {

        shape2 s1 = new circle();
        shape2 s2 = new rectangle();

        s1.draw();
        s2.draw();
    }
}