public class HTMLFilteredReader extends MySimpleURLReader{ //class to filter the html tags, extends MySimpleURLReader

    //constructor
    public HTMLFilteredReader(String arg0) {
        super(arg0);
    }
    
    //methods
    /**gets the original version of the html text with html tags
     * @return String
     */
    public String getUnfilteredPageContents(){
        return getPageContents();
    }

    /**gets the page contents without the html tags
     * @return String
     */
        public String getPageContents(){ 
        String content =super.getPageContents();
        int startPos;
        int EndPos;
        startPos = content.indexOf("</script>");
        EndPos = content.lastIndexOf("</section>");
        content = content.substring(startPos, EndPos);
        content = content.replaceAll("\\<.*?\\>", "");
        content = content.replaceAll("[\\t ]", "");
        return content;
       }
 
}
