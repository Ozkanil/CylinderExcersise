package Cylinder;

public class Runner {

    public static void main(String[] args) {

        Circle circle= new Circle(3.75);
        System.out.println(circle.getRadius());

        Cylinder cylinder= new Cylinder(5.55, 7.25);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
