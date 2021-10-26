public class Square extends Rectangle{ //sub-class, extends shape

    //constructor
    public Square(int width, int x, int y){
        super(width, width, x,y);
    }

    /**
    * gets area of shape by calling super method
    * @return double
    */
    public double getArea() {
        return super.getArea();
    }

    /**
    * gets perimeter of shape by calling super method
    * @return double
    */
    public double getPerimeter() {
        return super.getPerimeter();
    }

    /**
    * ToString method
    * @return String
    */
    public String toString() {
        return "The shape is a Square with Area= " + getArea() + " and Perimeter= " + getPerimeter() + " Selectable= " + getSelected();
    }

}
