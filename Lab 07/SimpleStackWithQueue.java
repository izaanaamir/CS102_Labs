//class for stack implementation

public class SimpleStackWithQueue {
    //properties
    private SimpleQueue queue1;
    private SimpleQueue queue2;

    //constructor
    public SimpleStackWithQueue(){ 
        queue1 = new SimpleQueue();
        queue2 = new SimpleQueue();
    }

    /**
     * pushes data to Stack
     * @param data
     */
    public void push(String data){
        queue2.enqueue(data);
        while (!queue1.isEmpty()) {
            Node temp = queue1.dequeue();
            queue2.enqueue(temp.printVal());
        }
        queue1 = queue2;
        queue2 = new SimpleQueue();
        
    }

    /**
     * removes top node from queue
     * @return Node 
     */
    public Node pop(){
        return queue1.dequeue();
    }

    /**
     * toString method
     * @return String
     */
    public String toString(){
        String str = "";
        SimpleQueue temp = queue1;
        if (queue1.isEmpty()) {
            return "Empty Stack";
        }
        while (!queue1.isEmpty()) {
            str = str + temp.dequeue().printVal() + " ";
        }
        return str;
    }


}
