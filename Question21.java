/* Count even numbers
 Given an integer print the number of even integers and if the number of even intger is greater than 3 than print the 
 number of even integers else print it is not a valid number.
 example:
 Input: 123589667
 Output: 4
 Input: 135896
 Output: It is not a valid number 
 */

 import java.util.*;

 public class Question21{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = s.length();
        int count = 0;
        for(int i = 0; i<k; i++){
            int ch = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (ch%2==0){
                count++;
            } 
        } if (count>3){
            System.out.println(count);
        } else {
            System.out.println("Number is not valid");
        }
    }

 }