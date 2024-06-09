/*To print number of spaces and number of characters
Example:
Input: Hi I am a Student 
Output: 4 13
*/
import java.util.*;
public class Question15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count1 = 0; 
        int count2 = 0;
        int k = s.length();
        for (int i = 0; i <k; i++){
            char ch = s.charAt(i);
            if (ch  == ' '){
                count1++;
            } else if (ch>= 'a'|| ch<='z'|| ch>= 'A'||ch<='Z'){
                count2++;

            }
        } System.out.println(count1+" "+ count2);
    }
    
}

 /*OR 
 Another Approach
 import java.util.*;
 public class Question15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = s.length();
        int count = 0;
        int p = k-count;
        for (int i = 0; i<k; i++){
            char ch  = s.charAt(i);
            if (ch == ' '){
                count++;

            }
        } System.out.print(count + " ");
        System.out.println(k-count);
    }
 }
 */