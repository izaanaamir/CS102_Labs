public class Triangle extends Shape{ //sub-class, extends shape
    
    //properties
    private int sideA;
    private int sideB;
    private int sideC;

    //constructor
    public Triangle(int sideA, int sideB, int sideC, int x, int y){
        super(x,y);
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

    /**
    * gets area of shape
    * @return double
    */
    public double getArea() {
        double area = 0;
        area = (sideA*sideC)/2;
        return area;
    }


    /**
    * gets perimeter of shape
    * @return double
    */
    public double getPerimeter() {
        double perimeter = 0;
        perimeter = sideA+sideB+sideC;
        return perimeter;
    }

    /**
    * ToString method
    * @return String
    */
    public String toString() {
        return "The shape is a Triangle with Area= " + getArea() + " and Perimeter= " + getPerimeter() + super.toString();
    }


}
