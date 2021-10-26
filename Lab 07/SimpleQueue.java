// Class for creating a cueue using linked lists
public class SimpleQueue {
    //properties
    private SimpleLinkedList queue;

    //constrcutor
    public SimpleQueue(){
        queue=new SimpleLinkedList();
    }

    /**
     * adds data to queue
     * @param data
     */
    public void enqueue(String data){
        queue.addToTail(data);
    }

    /**
     * removes data from queue
     * @return Node
     */
    public Node dequeue(){
        return queue.removeFromHead();
    }

    /**
     * checks if queue is empty
     * @return boolean
     */
    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
