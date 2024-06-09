/*Example:
Count number of letters in lowercase in a string.
Input:
DataBaSE
Output:
4

*/import java.util.*;
public class Question13 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        int k = s.length();
        int count = 0;
        for (int i = 0; i<k; i++){
            char ch = s.charAt(i);
            if (ch>= 'a' && ch<= 'z'){
                count++;
            }
        } System.out.println(count);


    }
}