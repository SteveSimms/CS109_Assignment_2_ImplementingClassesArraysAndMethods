package org.example;

import java.awt.geom.Rectangle2D;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
// todo: implement getRectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area: " +  rectangle.calculateArea( ));

// -- end getRectangle impl


// todo: implement getCylinder()

        System.out.println("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("The Volume of the cylinder is: " + cylinder.calculateVolume());


    }
}


