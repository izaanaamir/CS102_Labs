public class WordSearch extends HTMLFilteredReader{ //class to find words inside the text, extends HTMLFilteredReader

    //constructor
    public WordSearch(String arg0) {
        super(arg0);    
    }
    
    //methods
    /**searches for a particular word
     * @param word
     * @return int position of word in text
     */
    public int SearchforWord(String word){
        String text;
        int location;
        text =getPageContents();
        location =text.indexOf(word);
        return location;
        }
    
}
