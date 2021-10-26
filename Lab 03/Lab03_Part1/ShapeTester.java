import java.util.Scanner;

/**
 * This a tester class for the Shape, ShapeContainer class
 * @author Izaan Aamir
 * @version 06.07.2021
*/ 
public class ShapeTester {
    public static void main(String[] args) {

        //variables
        Scanner scan = new Scanner(System.in);
        boolean status = true;

        //program code
        ShapeContainer shapeContainer = new ShapeContainer();
        do { // all choices
            System.out.println("Welcome. Please select an option"); 
            System.out.println("Press 1 to add shapes"); 
            System.out.println("Press 2 to get perimeter"); 
            System.out.println("Press 3 to get area"); 
            System.out.println("Press 4 to get shapes in the list"); 
            System.out.println("Press 5 to initialize a new shapeContainer"); 
            System.out.println("Press 6 to find a shape with given x and y coordinates"); 
            System.out.println("Press 7 to remove all selected shapes"); 
            System.out.println("Press 8 to exit"); 

            int choice = scan.nextInt();
            if (choice == 1){
                System.out.println("what type of shape do you want");
                System.out.println("Press 1 for Rectangle");
                System.out.println("Press 2 for Circle");
                System.out.println("Press 3 for Triangle");
                System.out.println("Press 4 for Square");
                int choice2 = scan.nextInt();
                if (choice2 == 1) { //selecting specific shapes
                    System.out.println("Enter width");
                    int width = scan.nextInt();
                    System.out.println("Enter height");
                    int height = scan.nextInt();
                    System.out.println("Enter x-coordinate");
                    int x = scan.nextInt();
                    System.out.println("Enter y-coordinate");
                    int y = scan.nextInt();
                    Rectangle rectangle = new Rectangle(width, height,x,y);
                    shapeContainer.add(rectangle);
                }
                if (choice2 == 2) {
                    System.out.println("Enter radius");
                    int radius = scan.nextInt();
                    System.out.println("Enter x-coordinate");
                    int x = scan.nextInt();
                    System.out.println("Enter y-coordinate");
                    int y = scan.nextInt();
                    Circle circle = new Circle(radius,x,y);
                    shapeContainer.add(circle);
                }
                if (choice2 == 3) {
                    System.out.println("Enter side A");
                    int sideA = scan.nextInt();
                    System.out.println("Enter side B");
                    int sideB = scan.nextInt();
                    System.out.println("Enter side C");
                    int sideC = scan.nextInt();
                    System.out.println("Enter x-coordinate");
                    int x = scan.nextInt();
                    System.out.println("Enter y-coordinate");
                    int y = scan.nextInt();
                    Triangle triangle = new Triangle(sideA, sideB, sideC,x,y);
                    shapeContainer.add(triangle);
                }
                if (choice2 == 4) {
                    System.out.println("Enter width");
                    int width = scan.nextInt();
                    System.out.println("Enter x-coordinate");
                    int x = scan.nextInt();
                    System.out.println("Enter y-coordinate");
                    int y = scan.nextInt();
                    Square square = new Square(width,x,y);
                    shapeContainer.add(square);
                }
            }
            if(choice == 2){
                System.out.println(shapeContainer.getPerimeter());
            }
            if (choice == 3) {
                System.out.println(shapeContainer.getArea());
            }
            if (choice == 4) {
                System.out.println(shapeContainer.toString());
            }
            if (choice == 5) {
                shapeContainer = new ShapeContainer();
            }
            if (choice == 6) {
                System.out.println("Enter x-coordinate");
                int x = scan.nextInt();
                System.out.println("Enter y-coordinate");
                int y = scan.nextInt();
                System.out.println(shapeContainer.shapeFinder(x, y));

            }
            if (choice == 7) {
                shapeContainer.removeSelectedShapes();
                System.out.println("All selected shapes removed");
            }
            if (choice == 8) {
                status = false;
            }

        } while (status);

        scan.close();
    }
}
