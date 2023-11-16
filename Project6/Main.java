package Project6;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the Circle Creator!");
        System.out.println("How many circles would you like to create?:");
        int numberOfCircles = scnr.nextInt();
        Circle[] circles = new Circle[numberOfCircles];
        for (int i = 0; i < numberOfCircles; i++) {
            // Prompt Radius:
            System.out.println("Enter the radius of circle " + (i + 1) + ":");
            double radius = scnr.nextDouble();
            // Prompt X:
            System.out.println("Enter the x coordinate of circle " + (i + 1) + ":");
            double x = scnr.nextDouble();
            // Prompt Y:
            System.out.println("Enter the y coordinate of circle " + (i + 1) + ":");
            double y = scnr.nextDouble();
            // Create the circle:
            circles[i] = new Circle(radius, x, y);
        };

        System.out.println("Here are your circles:");
        for (int i = 0; i < numberOfCircles; i++) {
            System.out.println("Circle " + (i + 1) + ":");
            System.out.println("\tRadius: " + circles[i].getRadius());
            System.out.println("\tX: " + circles[i].getX());
            System.out.println("\tY: " + circles[i].getY());
            System.out.println("\tArea: " + circles[i].getArea());
        }

        // Check for overlap
        for (int i = 0; i < numberOfCircles; i++) {
            for (int j = i + 1; j < numberOfCircles; j++) {
                if (circles[i].doesOverlap(circles[j])) {
                    System.out.println("Circle " + (i + 1) + " overlaps with circle " + (j + 1) + ".");
                }
            }
        }

    }
    
}
