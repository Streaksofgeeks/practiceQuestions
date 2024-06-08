// java calculator
import java.util.*;
public class Question10 {
    public static void main(String[] args){
        System.out.print("enter the first number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        System.out.print("Entre the operator (+-*/):");
        Scanner st = new Scanner(System.in);
        char c = st.nextLine().charAt(0);

        if (c == '+'){
            System.out.println(a+b);
        } else if (c== '-'){
            System.out.println(a-b);
        } else if (c== '*'){
            System.out.println(a*b);
        } else if (c== '/'){
            System.out.println(a/b);
        } else {

            System.out.println("Enter correct operator");
        }


    }
    
}
