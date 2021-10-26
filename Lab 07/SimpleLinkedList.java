// Linked List Class to create a LinkedList using Nodes

public class SimpleLinkedList{

    //properties
    private Node head;

    //contructor
    public SimpleLinkedList(){
        head = null;
    }
    
    /**
     * adds data to end of List
     * @param data
     */
    public void addToTail(String data){
        Node newNode = new Node(data);
        newNode.setNext(null);
        if (head == null) {
            head = newNode;
        }
        Node temp = head;

        while (temp.getNext() != null ) {
           temp = temp.getNext();
        }
        temp.setNext(newNode);
        newNode.setNext(null);
    }

    /**
     * removes data from the head of the list
     * @return Node
     */
    public Node removeFromHead(){

        if(head == null){
            return null;
        }
        Node temp = head;
        head = head.getNext(); 
        return temp;
    }

    /**
     * checks if list is empty
     * @return boolean
     */
    public boolean isEmpty(){
        return (head == null);
    }

    /**
     * gets the Node which has the given data
     * @paramd data
     * @return Node
     */
    public Node get(String data){
        Node temp = head;
        while (temp!= null) {
            if(temp.printVal() == data){
                return temp;
            }
            else{
                temp = temp.getNext();
            }
        }
        
        return null;
    }

    /**
     * toString method
     * @return String
     */
    @Override
    public String toString(){
        String str ="";
        Node temp =head; 
        str = "";
        if(temp == null){
            return "The list is empty";
        }
        while(temp != null){
            str = str + temp.printVal()+ " ";
            temp = temp.getNext(); 
        }
        return str;
    }
}
