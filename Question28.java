import java.util.*;

public class Question29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int target =x;
        int sum = 0;
        int tem = 0;
        while (x>0){
            tem = x%10;
            x = x/10;
            sum = sum*10 + tem;

        }
        if(sum == target){

            System.out.println(true);

        } else{
            System.out.println(false);
        }
        


    }
    
}
