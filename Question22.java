/*WAP to print consonants and vowels in a given string
Example:
Input:
Hello World!
Output:
Vowel: 3
Consonants : 7
*/
import java.util.*;
public class Question22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = s.length();
        int count1=0;
        int count2=0;
        for (int i = 0; i<k; i++){
            char ch  = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                if (ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch == 'u' || ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch == 'U'){
                    count1++;
                } else{
                    count2++;
                }
            }
        } System.out.println( "Vowel:"+count1);
          System.out.println("Consonants:"+count2);

    }
}
