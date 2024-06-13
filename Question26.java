/*Write a method to take 5 inputs and find their sum only if they are odd number and print the sum 
if the sum is greater than 8 else print NA
Example:
Input:
1
3
2
5
9
Output:
Sum of odd number: 18

Input 2:
1
3
6
4
2
Output2:
NA

*/

import java.util.*;

public class Question26 {
    public static void odd(){
        int k =0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5; i++ ){
            int a = sc.nextInt();
            if (a%2 != 0){
                k = k+a;
            } 
            
        } if (k>8){
            System.out.println("Sum of odd numbers:"+" "+ k);
        } else{
            System.out.println("NA");
        }
    }
    public static void main(String[] args){
        odd();
    }
    
}
