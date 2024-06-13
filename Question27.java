/*Given a string where you have to print unique characters only.
 * Input: Management
 * Output: Mangemnt
 * 
*/
import java.util.*;
public class Question27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = s.length();
        String p = "";

        for (int i = 0; i<k; i++){
            char ch = s.charAt(i);
            if (p.contains(Character.toString(ch))){
                continue;
            }else{
                p = p+ch;
            }


        } System.out.println(p);
    }
    
}
