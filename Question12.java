    /*Example:
String  = Coperation
Input Word = o 
Output = 1 
*/

import java.util.*;
public class Question12 {



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Scanner st = new Scanner(System.in);
        char c = st.next().charAt(0);
        int p = s.length();

        for (int i = 0; i<p; i++){
            if (s.charAt(i)== c){
                System.out.println(i);
                break;
            }

        }
        


    }

    
}

    
