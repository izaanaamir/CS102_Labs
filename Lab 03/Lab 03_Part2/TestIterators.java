import java.util.Iterator;

/**
 * This a tester class for the intBag, Iterator and IntBagIterator Class
 * @author Izaan Aamir
 * @version 06.07.2021
*/ 
public class TestIterators {
    public static void main(String[] args) {

        //variables 
        IntBag bag = new IntBag(2);

        //program code
        bag.addValueToEnd(1);
        bag.addValueToEnd(2);
        bag.addValueToEnd(3);
        bag.addValueToEnd(4);
        bag.addValueToEnd(5);
        bag.addValueToEnd(6);
        bag.addValueToEnd(7);
        bag.addValueToEnd(8);

        Iterator<Integer> i, j;
        i = bag.iterator();
        while ( i.hasNext() )
        {
            System.out.println( i.next() );
            j = bag.iterator();
            while ( j.hasNext() )
            {
                    System.out.println( "--" + j.next() );
            }
        }
    }
}
