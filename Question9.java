//Armstrong number
import java.util.*;
 
public class Question9 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int sum = 0;
        int n = num.length();
        int k =sc.nextInt();

        for(int i = 0; i < n; i++){
            sum+= Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))),k);
        }
        if (sum == Integer.parseInt(num)){
            System.out.println("The number is armstrong");

        }else{
            System.out.println("The number is not armstrong");
        }

    }
}