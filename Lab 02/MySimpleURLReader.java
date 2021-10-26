import cs1.SimpleURLReader;

public class MySimpleURLReader extends SimpleURLReader{ // Extends SimpleURLReader

    //properties
    private String arg0;
    
    //constructor
    public MySimpleURLReader(String arg0) {
        super(arg0);
        this.arg0 = arg0;
    }
    
    //methods
    /** gets the url of the objet
     * @return the arg0 passed
     */
    public String getURL(){
        return arg0;
    }

    /**returns the name of the website
     * @return name of website
     */
    public String getName(){
        int location;
        location = arg0.lastIndexOf("/");
        return arg0.substring(location+1);
    }

    /**gets the numbers of CSS links used on a website
     * @return int 
     */
    public int getNumberOfCSSLinks(){
        int count = 0;
        String text=getPageContents();
            while (text.contains(".css" )) {
                text = text.replaceFirst("\\.css" , "");
                count++;
            }
        return count;
    }
} 
