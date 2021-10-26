public class Rectangle extends Shape{ //sub-class, extends shape
    
    //properties
    private int width;
    private int height;

    //constructor
    public Rectangle(int width, int height, int x, int y){
        super(x, y);
        this.width=width;
        this.height=height;
    }

    /**
    * gets area of shape
    * @return double
    */
    public double getArea() {
        double area;
        area = height*width;
        return area;
    }

    /**
    * gets perimeter of shape
    * @return double
    */
    public double getPerimeter() {
        double perimeter = 0;
        perimeter = 2* (width+height);
        return perimeter;
    }

    /**
    * ToString method
    * @return String
    */
    public String toString() {
        return  "The shape is a Rectangle with Area= " + getArea() + " and Perimeter= " + getPerimeter() + super.toString();
    }

}
