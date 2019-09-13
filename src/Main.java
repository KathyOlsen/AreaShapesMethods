import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        //Use methods to calculate the areas of a circle, triangle, rectangle, or square with user input.
        Scanner key = new Scanner(System.in);
        String again = "";
        do {
            System.out.println("What shape would you like to calculate the area of? (circle/triangle/rectangle/square)");
            String shape = key.nextLine();
            if (shape.equalsIgnoreCase("circle")) {
                System.out.println("Please enter a number for the radius of the circle: ");
                double radius = key.nextDouble();
                key.nextLine();
                AreaCircle(radius);
                again = goAgain();
            } else if (shape.equalsIgnoreCase("triangle")) {
                System.out.println("Please enter a number for the base of the triangle: ");
                double base = key.nextDouble();
                key.nextLine();
                System.out.println(" Please enter a number for the height of the triangle: ");
                double height = key.nextDouble();
                key.nextLine();
                AreaTriangle(base, height);
                again = goAgain();
            } else if (shape.equalsIgnoreCase("rectangle")) {
                System.out.println("Please enter a number for the length of the rectangle: ");
                double length = key.nextDouble();
                key.nextLine();
                System.out.println(" Please enter a number for the width of the rectangle: ");
                double width = key.nextDouble();
                key.nextLine();
                AreaRectangle(length, width);
                again = goAgain();
            } else if (shape.equalsIgnoreCase("square")) {
                System.out.println("Please enter a number for the length a side of the square: ");
                double side = key.nextDouble();
                key.nextLine();
                AreaSquare(side);
                again = goAgain();
            } else {
                System.out.println("Invalid answer.  Please try again");
                again = "true";
            }
        }while(again.equalsIgnoreCase("true"));

    }
    //separate methods for calculating each shape area
    private static void AreaCircle(double radius){
        double areaCircle = 3.14159 * pow(radius,2);
        System.out.println("The area of a circle of radius " + radius + " is " + areaCircle);
    }
    private static void AreaTriangle(double base, double height){
        double areaTriangle = 0.5 * base * height;
        System.out.println("The area of a triangle with a base of " + base + " and height of " +
                height + " is " + areaTriangle + ".");
    }
    private static void AreaRectangle(double length, double width){
        double areaRectangle = length * width;
        System.out.println("The area of a rectangle with a length of " + length + " and width of " +
                width + " is " + areaRectangle + ".");
    }
    private static void AreaSquare(double side){
        double areaSquare = pow(side,2);
        System.out.println("The area of a square with a side length of " + side + " is " + areaSquare);
    }
    //method for asking if user wants to go again
    private static String goAgain(){
        Scanner key2 = new Scanner(System.in);
        System.out.println("Do you want to go again? (y/n)");
        String response = key2.nextLine();
        if(response.equalsIgnoreCase("y")){
            return "true";
        }else{
            return "false";
        }
    }
}
