
/**
 * This a tester class for the LinkedLists, Queues and Stacks
 * @author Izaan Aamir
 * @version 30.08.2021
*/ 
public class Main {
    public static void main(String[] args) {
        //Part A and B
        SimpleLinkedList list= new SimpleLinkedList();
        list.addToTail("21");
        list.addToTail("17");
        list.addToTail("3");
        list.removeFromHead();
        System.out.println(list); 
        System.out.println(list.get("3")); 
        System.out.println("---------------"); 

        //Part C
        SimpleQueue queue1 = new SimpleQueue();
        queue1.enqueue("21");
        queue1.enqueue("2");
        queue1.enqueue("12");
        queue1.enqueue("29");
        queue1.enqueue("82");
        System.out.println(queue1.dequeue()); 
        System.out.println(queue1.dequeue()); 
        System.out.println("---------------"); 

        // //Part D
        SimpleStackWithQueue stack = new SimpleStackWithQueue();
        stack.push("34");
        stack.push("6");
        stack.push("4");
        stack.push("3");
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.toString()); 

    }
}
