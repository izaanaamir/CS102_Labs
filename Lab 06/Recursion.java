import java.io.File;


/**
 * Recursion - Demonstrates Recursion methods
 *
 * @author Izaan Aamir
 * @version 1.00 18/7/2021
 */

public class Recursion{
    public static void main(String[] args) {
        //Question 1
        System.out.println(stringLength("izaan"));

        //Question 2
        System.out.println(numOfVowels("lmao"));
    
        //Question 3
        binaryStrings(3);

        //Question 4
        System.out.println(fileNumber(new File("D:/Books/Chess"),0));
    }

    //methods
    /**
     * calculates stringlength using recursion
     * @param str
     * @return length of string
     */
    public static int stringLength(String str){

        int count = 0;
        if (str.length() == 1){
            return 1;
        }
        count++;
        return count + stringLength(str.substring(1, str.length()));
    }

    /**
     * calculates number of Vowels in a string using recursion
     * @param str
     * @return numofVowels
     */
    public static int numOfVowels(String str){
        int count = 0;
        if (str.length() == 1){
            return 1;
        }
        char[] vowels = {'a','i','o','u','e'};
        for (int i = 0; i < vowels.length; i++) {
            if (Character.toLowerCase(str.charAt(0)) == vowels[i]) {
                count++;
            }        
            
        }
        return count + numOfVowels(str.substring(1, str.length()));
    }

    /**
     * prints strings of binary of length n using recursion
     * @param int
     */
    public static void binaryStrings(int n){
        String str;
        if(n == 1){
            System.out.println("0\n");
            return;
        }
        str = "0";
        binaryHelper(n-1, str);
        str = "1";
        binaryHelper(n-1, str);
    }

    /**
     * helper method for binaryString
     * @param str,n
     */
    public static void binaryHelper(int n, String str){

        if (n==1) {
            if (str.charAt(str.length()-1) == '0') {
                System.out.println(str +"1"); 
                System.out.println(str +"0"); 
                return;
            }
            if(str.charAt(str.length()-1) == '1'){ 
                System.out.println(str +"0");
                return;
            }
        }
        if (str.charAt(str.length()-1) == '0') {
            str=str+"0";
            binaryHelper(n-1, str);
            str = str.substring(0, str.length()-1);
            str=str+"1";
            binaryHelper(n-1, str);
            str = str.substring(0, str.length()-1);
        }
        if (str.charAt(str.length()-1) == '1') {
            str= str+"0";
            binaryHelper(n-1, str);
            str = str.substring(0, str.length()-1);
        }
    }

    /**
     * calculates number of files in a directory using recursion
     * @param file
     * @return int
     */
    public static int fileNumber(File file, int index){
        File[] files = file.listFiles();
        if (index ==files.length) {
            return 1;
        }    
        if(files[index].isFile()){
            index++;
            return 1 + fileNumber(file, index);
        }
        else{  
            return fileNumber(files[index], 0);
        }
    }
    

}
