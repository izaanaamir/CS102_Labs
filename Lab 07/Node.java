//class to create Node using head pointer

public class Node{

    //properties
    private String data;
    private Node next;

    //constructor
    public Node(String data){
        this.data= data;
        next = null;
    }
    
    /**
     * prints value of node
     * @return data
     */
    public String printVal(){
        return data;
    }

    /**
     * gets next Node
     * @return Node
     */
    public Node getNext(){
        return next;
    }

    /**
     * sets next Node
     * @param Node
     */
    public void setNext(Node n){
        this.next=n;
    }

    /**
     * prints value of node
     * @return data
     */
    public String toString(){
        return data;
    }
}