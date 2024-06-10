/* Print vowel at 0th index of every word in a string.
Example:
Input: Hey how r u I am a student;
*/

import java.util.*;
 
public class Question18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] p = s.split(" ");
        int k = p.length;
        String n = "";
        for (int i= 0; i<k; i++){
            String word = p[i];
            char ch = word.charAt(0);
            
            if (ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                System.out.print(ch);

            }
    }
            

        } 
}