/*Revrese the string 
 * Example:
 * Input: Reverse
 * Output:esreveR
*/
import java.util.*;
public class Question24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss = "";
        int p = s.length();
        int k = s.length();
        for(int i =0; i<k; i++){
            char ch = s.charAt(p-1);
            p--;
            ss = ss+ch;

        } System.out.println(ss);

    }

    
}
