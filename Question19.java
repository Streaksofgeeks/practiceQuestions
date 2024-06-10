/*enter an integer and if sum of their digits is divisible by 3 print true else print false */
import java.util.*;

public class Question19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;

        int k = s.length();
        for (int i = 0; i<k; i++){
            int p = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum = sum + p;

        } if (sum%3 == 0){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }

    
}
