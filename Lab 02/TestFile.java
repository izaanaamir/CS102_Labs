import cs1.SimpleURLReader;

/**
 * This a tester class for the MySimpleURLReader and its subclasses
 * @author Izaan Aamir
 * @version 24.06.2021
*/
public class Test {
    public static void main(String[] args) throws Exception {

        //Program Code
        SimpleURLReader reader1 = new SimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt");
        MySimpleURLReader reader2 = new MySimpleURLReader(" http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
        HTMLFilteredReader reader3 = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
        WordSearch reader4 = new WordSearch("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");

        //PART A. Testing SimpleURLReader
        System.out.println("The number of lines in the text are: " + reader1.getLineCount()); 
        System.out.println(reader1.getPageContents()); 
        System.out.println("================================================");

        //PART B. Testing MySimpleURLReader
        System.out.println("The URL of the website is " + reader2.getURL());
        System.out.println("The name of the website is " + reader2.getName());
        System.out.println("================================================");

        //PART C. Testing MySimpleURLReader getCSSLinks method
        System.out.println("The number of CSS links in this website are " + reader2.getNumberOfCSSLinks());
        System.out.println("================================================");

        //PART D. Testing HTMLFilteredReader
        System.out.println(reader3.getPageContents());
        System.out.println("================================================");

        //PART E. Testing WordSearch      
        System.out.println(reader4.SearchforWord("Ankara"));
        System.out.println(reader4.SearchforWord("Turkey"));
        System.out.println("================================================");

        
    }
}
