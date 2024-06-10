import java.util.*;
public class Question20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] m = s.split(" ");
        int k = m.length;
        String temp= "";
        for (int i = 0; i<k; i++){
            String word = m[i];
            int n = word.length();
            if (n>temp.length()){
                temp = word;
            }

        } System.out.println(temp);

    }

    
}
