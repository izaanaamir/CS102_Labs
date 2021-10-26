public abstract class Shape implements Locatable,Selectable{ //class for shape, implements Locatable, Selectable

    //properties
    private int x;
    private int y;
    private boolean selected;

    //constructor
    public Shape(int x, int y){
        setLocation(x, y);
        selected=false;
    }

    //methods
    abstract double getArea();
    abstract double getPerimeter();

    /**
    * gets x coordinate of shape
    * @return x
    */
    public int getX(){
        return x;
    }
    /**
    * gets y coordinate of shape
    * @return y
    */
    public int getY(){
        return y;
    }

    /**
    * sets x and y coordinate
    * @param x,y
    */
    public void setLocation(int x, int y){
        this.x=x;
        this.y=y;
    }

    /**
    * returns selected status of shape
    * @return selected
    */
    public boolean getSelected(){
        return selected;
    }

    /**
    * sets selected status of shape
    * @param status
    */
    public void setSelected(boolean status){
        selected = status;
    }

    /**
    * checks if a shape contains those coordinates
    * @return shaepe
    */
    public Shape contains(int x, int y){
        if (getX() == x && getY() == y) {
            setSelected(!getSelected());
            return this;
        }
        return null;
    }

    /**
    * ToString method
    * @return String
    */
    public String toString(){
        return " Selectable: " + getSelected();
    }
}
