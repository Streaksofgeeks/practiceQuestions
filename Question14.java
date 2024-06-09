/*To print unique string only 
Example:
Input: experience
Output: exprinc
*/
import java.util.*;
public class Question14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = s.length();
        String t = "";
        for (int i = 0; i<k; i++){
            if (t.indexOf(s.charAt(i))== -1){
                t = t+s.charAt(i);

            }
        }System.out.println(t);

    } 
}
