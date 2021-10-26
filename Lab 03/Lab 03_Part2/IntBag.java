import java.util.Arrays;
import java.util.Iterator;

//class for IntBag outer class, intBagIterator inner class and intBagStepIterator inner class
public class IntBag{

    class IntBagIterator implements Iterator<Integer>{ //inner class, implements Iterator
        private IntBag aBag;
        private int index;

        //constructor
        public IntBagIterator(IntBag b){
            index = 0;
            aBag = b; //assigns the intBag parameter to the aBag inside inner class
        }

        //methods
        /**
        * checks if intBag array has next element
        * @return boolean
        */
        public boolean hasNext() {
            if (index < aBag.size() && aBag.size() >0)
            {
                return true;
            }
            return false;
        }

        /**
        * returns the next element in the array
        * @return Integer wrapper
        */
        public Integer next() {
            if(hasNext()){
                int value = aBag.fetchValue(index);
                index++;
                return (Integer) value;
            }
        return 0;
        }
    }
    
    //inner class with stepValue, implements Iterator
    class IntBagStepIterator implements Iterator<Integer>{ 
        private IntBag aBag;
        private int index;
        private int stepValue;

        //constructor
        public IntBagStepIterator(IntBag b, int m){
            index = 0;
            aBag = b;
            stepValue = m;
        }

        //methods
        /**
        * checks if intBag array has next element with step value
        * @return boolean
        */
        public boolean hasNext() {
            if (index +stepValue < aBag.size() && aBag.size() >0)
            {
                return true;
            }
            return false;
        }

        /**
        * returns the next element in the array with step value
        * @return Integer wrapper
        */
        public Integer next() {
            if(hasNext()){
                int value = aBag.fetchValue(index);
                index=index+stepValue;
                return (Integer) value;
            }
        return 0;
        }

        }

    //properties
    private int [] bag;
    private int stepVal;

    //constructor
    public IntBag(){
        bag = new int[4];
        bag[0] = -1;
    }

    public IntBag(int stepVal){
        bag = new int[4];
        bag[0] = -1;
        this.stepVal=stepVal;
    }

    //methods
    /**
     * adds value to the end of the array
     * @param value to be entered
     */
    public void addValueToEnd(int value){
        if(bag[bag.length -1] == -1){
            int[] newbag= Arrays.copyOf(bag, bag.length * 2);
            bag = newbag;
        }
        if (value >= 0){
            for (int i = 0; i < bag.length - 1; i++) {
                if(bag[i] == -1){
                    bag[i] = value;
                    bag[i+1] = -1;
                    return;
                }
            }
        }
    }

    /**
     * adds a value to a specific index of an array and moves everything forward
     * @param value and index
     */
    public void addValue(int value, int index){
        if(bag[bag.length -1] == -1){
            int[] newbag= Arrays.copyOf(bag, bag.length * 2);
            bag = newbag;
        }
        if (index < bag.length && index > 0 && value > 0){
            int temp = bag[index];
            bag[index] = value;
            for(int j = index+1; bag[j] > -1; j++){
                bag[j] = temp;
                temp = bag[j+1]; 
            }
        }
    }

    /**
     * removes the value from a specific index of the array
     * @param the index
     */
    public void removeValue(int index){
        for (int i = 0; bag[i] >= -1; i++) {
            if (bag[i] == -1) {
                bag[index] = bag[i-1];
                bag[i-1] = -1;
                bag[i] = 0;
                return;
            }
        }
    }

    /**
     * checks if a certain value is present in the array
     * @param value
     * @return boolean
     */
    public boolean checkValue(int value){
        for (int i = 0; bag[i] > -1; i++){
            if (bag[i] == value){
                return true;
            }
        }
        return false;
    }

    /**
     * toString method of the array
     * @return String representation of the array
     */
    public String toString(){
        return  Arrays.toString(bag);
    }

    /**
     * shows the0 used size of the array
     * @return int size of the array
     */
    public int size(){
        int count=0;
        while (bag[count] > -1) {
            count++;
        }
            return count+1;
    }

    /**
     * fetches the value at a specific index
     * @param the index
     * @return the value
     */
    public int fetchValue(int index){
        if (index < bag.length) {
            return bag[index];
        }       
        return 0; 
    }

    /**
     * removes all instances of a specific value
     * @param number to be removed
     */
    public void removeAll(int number){
      while (checkValue(number)) {
            for (int i = 0; bag[i] > -1; i++) {
                if (bag[i] == number) {
                  removeValue(i);
                  i =0;
                }
            }
        }
    }

    public Iterator<Integer> iterator(){
        IntBagStepIterator intBagIterator1 = new IntBagStepIterator(this, stepVal);
        return intBagIterator1;
    }
}
