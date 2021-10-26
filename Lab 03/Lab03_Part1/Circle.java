public class Circle extends Shape{ //sub-class, extends shape
    
    //properties
    private int radius;

    //constructor
    public Circle(int radius, int x,  int y){
        super(x,y);
        this.radius=radius;
    }

    /**
    * gets area of shape
    * @return double
    */
    public double getArea() {
        double area = 0;
        area = Math.PI* radius*radius;
        return area;
    }
    
    /**
    * gets perimeter of shape
    * @return double
    */
    public double getPerimeter() {
        double perimeter = 0;
        perimeter = Math.PI* radius*2;
        return perimeter;
    }

    /**
    * ToString method
    * @return String
    */
    public String toString() {
        return "The shape is a Circle with Area= " + getArea() + " and Circumference= " + getPerimeter() + super.toString();
    }


}
