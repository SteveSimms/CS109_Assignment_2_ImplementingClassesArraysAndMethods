package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * This program calculates the area of a rectangle and the volume of a cylinder, cube, and sphere.
 * It prompts the user to enter the necessary dimensions and performs the calculations.
 * The program demonstrates the use of object-oriented principles in Java.
 * using constructors, methods, and objects.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
// todo: implement getRectangle();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.println("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(length, width);
            System.out.println("Area: " + rectangle.calculateArea());

// -- end getRectangle impl


// todo: implement getCylinder()

            System.out.println("Enter the radius of the cylinder: ");
            double radius = scanner.nextDouble();
            System.out.println("Enter the height of the cylinder: ");
            double height = scanner.nextDouble();
            Cylinder cylinder = new Cylinder(radius, height);
            System.out.println("The Volume of the cylinder is: " + cylinder.calculateVolume());


            // -- end getCylinder() impl


            // Cube Volume Calculation
            System.out.println("Enter the side length of the cube:");
            double side = scanner.nextDouble();
            Cube cube = new Cube(side);
            System.out.println("The volume of the cube is: " + cube.calculateVolume());

            // Sphere Volume Calculation
            System.out.println("Enter the radius of the sphere:");
            double sphereRadius = scanner.nextDouble();
            Sphere sphere = new Sphere(sphereRadius);
            System.out.println("The volume of the sphere is: " + sphere.calculateVolume());

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }



    }



