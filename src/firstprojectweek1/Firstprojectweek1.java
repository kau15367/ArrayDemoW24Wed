
package firstprojectweek1;

import java.util.Scanner;

/**
 *commenting for modification on jan17 at 9:50 am
 * @author Admin
 */
public class Firstprojectweek1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the word");
        Scanner input = new Scanner(System.in);
        String myWord = input.nextLine();
        
        char[] myLetters = new char[myWord.length()];
        for(int i=0;i<myLetters.length;i++){
            myLetters[i] = myWord.charAt(i);
        }
        System.out.println("Printing in reverse");
        for(int i=myLetters.length-1;i>=0;i--){
            System.out.println(myLetters[i]);
        }
        // TODO code application logic here
        //System.out.println(myWord);
        
    }
    
}
