import java.util.ArrayList;

public class ShapeContainer { // Arraylist containing shapes 

    //properties
    private ArrayList<Shape> shapes;

    //constructor
    public ShapeContainer(){
        shapes = new ArrayList<Shape>();
    }
    

    /**
    * adds shape to ArrayList
    * @param s
    */
    public void add(Shape s){
        shapes.add(s);
    }
    
    /**
    * gets total area
    * @return double
    */
    public double getArea(){
        double totalArea = 0;
        for (int i = 0; i < shapes.size(); i++) {
            totalArea = totalArea + shapes.get(i).getArea();
        }
        return totalArea;
    }

    /**
    * gets total perimeter
    * @return double
    */
    public double getPerimeter(){
        double totalPerimeter = 0;
        for (int i = 0; i < shapes.size(); i++) {
            totalPerimeter = totalPerimeter + shapes.get(i).getPerimeter();
        }
        return totalPerimeter;        
    }

    /**
    * toString method for all elements
    * @return String
    */
    public String toString() {
        String information ="";
        for (int i = 0; i < shapes.size(); i++) {
            information = information +shapes.get(i).toString() +"\n";
        }
        return information;
    }

    /**
    * finds shape with given x and y coordinates
    * @return String
    */
    public String shapeFinder(int x, int y){
        while (shapes.size() >1) {
            Shape shape=null;
        String shapesList ="";
        for (int i = 0; i < shapes.size(); i++) {
            shape = shapes.get(i).contains(x, y);
            if (shape instanceof Shape){
                shapesList = shapesList + shape.toString() + "\n";
            }
        }
        return shapesList;
        }
        return "No matches found";
    }

    /**
    * removes shapes if they are selected
    * @return void
    */
    public void removeSelectedShapes(){
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getSelected()) {
                shapes.remove(i);
                System.out.println("One item removed");
                i=-1;
            }
        }
    }
}
