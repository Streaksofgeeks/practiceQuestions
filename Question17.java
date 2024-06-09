/*To print number of spaces in a string but with a condition that
 if a the number of spaces is greater than or equal 
 to 3 print number of spaces else print NA*/
 
 import java.util.*;
 public class Question17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count =0;
        int k = s.length();
        for (int i = 0; i<k; i++){
            char ch = s.charAt(i);
            if (ch == ' '){
                count++;
            }
        }
            if (count>= 3){
                System.out.println(count);

            } else{
                System.out.println("NA");
            }
        
    }
    
}
