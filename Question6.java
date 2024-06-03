/*  5 6
5X1=5
5X2=10
5X3=15
5X4=20
5X5=25
5X6=30
*/

import java.util.*;
public class Question6 {
    public static void kk(){
        Scanner myObj = new Scanner(System.in);
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();

    for(int i=1; i<=num2; i++ ){
        System.out.println(num1+"X"+i+"="+num1*i);
    }
        
    }

    public static void main(String [] args){
        kk();
    }
    


    
}
