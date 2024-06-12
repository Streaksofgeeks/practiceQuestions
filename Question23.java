/*Count the number of spaces and number of characters in a given string and ignore digits.
 Example:
 Input: Hey how are you
 Output: 
 Number of spaces: 3
 Number of output: 12
*/
import java.util.*;
public class Question23 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc .nextLine();
        int count1 =0;
        int count2=0;
        int k  = s.length();
        for (int i = 0; i<k; i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)==false){
                if(ch==' '){
                    count1++;
                }else{
                    count2++;
                }
            }
        } System.out.println("Number of spaces:"+count1);
        System.out.println("Number of characters:"+count2);


    }
    
}
