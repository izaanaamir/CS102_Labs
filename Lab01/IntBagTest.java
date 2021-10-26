import java.util.Scanner;

/**
 * This a tester class for the intBag class
 * @author Izaan Aamir
 * @version 17.06.2021
*/ 
public class IntBagtest {


    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in); 
        IntBag intbag2 = new IntBag();
        boolean keepPlaying = true;
        int option;
        boolean moreValues = true;

        //methods
        //while to keep displaying the menu until user quits
        while (keepPlaying) {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Please select one of the following options by selecting the corresponding number.");
            System.out.println("1. Create a new empty collection.");
            System.out.println("2. Read a set of positive values into the collection (use zero to indicate all the values have been entered.)");
            System.out.println("3. Print the collection of values.");
            System.out.println("4. Add a value to the collection of values at a specified location");
            System.out.println("5. Remove the value at a specified location from the collection of values");
            System.out.println("6. Remove all instances of a value within the collection");
            System.out.println("7. Quit the program");
            System.out.println("--------------------------------------------------------------------------------");

            option = scan.nextInt();
            scan.nextLine();
            // to initialize the array to a new array
            if (option == 1) {
                intbag2 = new IntBag();
                System.out.println("The collection has been cleared");
            }
            if (option == 2) {
                // to take value inputs to add to intBag
                int value;
                while (moreValues) {
                    System.out.println("Please enter the value. Enter 0 to finish");
                    value = scan.nextInt();
                    if (value > 0) {
                        intbag2.addValueToEnd(value);
                    }
                    if (value == 0) {
                        moreValues =false;
                    } 
                }
            }
            if (option == 3) {
                //prints the contents of the array
                System.out.println(intbag2.toString()); 
            }
            if (option == 4) {
                //adds value to a specific index
                int value;
                int index;
                System.out.println("Please enter the value you want to enter:");
                value = scan.nextInt();
                System.out.println("Please enter  the index");
                index = scan.nextInt();
                intbag2.addValue(value, index);
                System.out.println("The value " + value + " has been added at index " + index );

            }
            if (option == 5) {
                //removes value at a specific index
                int index;
                System.out.println("Please enter the index at which you want the value removed");
                index = scan.nextInt();
                intbag2.removeValue(index);
                System.out.println("The value has been removed at index " + index);

            }
            if (option == 6) {
                //removes all instances of a specific value
                int value;
                System.out.println("Please enter the value of which you want all instances removed"); 
                value = scan.nextInt();
                intbag2.removeAll(value);
                System.out.println("All values have been removed");

            }
            if (option == 7) {
                //ends the WHILE loop and quits the program
                keepPlaying = false;
                System.out.println("GoodBye!");
            }
        }
        scan.close();
    }

        
    /** method that uses an instance of the intBag class to display all Fibonacci numbers
     * @param takes the number until which the fibonachhi series is required
     * @return String output of the values in the intbag array
     */
    public String fibonacciNumbers(int number){

        IntBag intbag1 = new IntBag();
        intbag1.addValueToEnd(0); // adds 0 and 1 to initialize the array
        intbag1.addValueToEnd(1);
        
            if (number == 1) {
                return "The Fibonachi numbers are as follows: " + intbag1.toString();
            }
            else{
                for (int i = 0; i < number; i++) {                    
                    intbag1.addValueToEnd(intbag1.fetchValue(i)+ intbag1.fetchValue(i+1));
                }
                return "The Fibonachi numbers are as follows: " + intbag1.toString(); 
            }
    }  


}   
