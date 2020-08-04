
class Circle {

    private int radius;

    public Circle(int radius) {

        this.radius = radius;
    }

    public double area() {

        return this.radius * this.radius * Math.PI;
    }

public static void main(String[] args) {

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(8);

        System.out.println("Area of circle 1 is "+c1.area());
        System.out.println("Area of circle 2 is "+c2.area());
    }
}
