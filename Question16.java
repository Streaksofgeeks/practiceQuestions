/*
Print the last character of a string.
Example:
Input: Hey3 I am a GOAT
OUtput: ImaT
*/import java.util.Scanner;

public class Question16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] p = s.split(" ");
        int k = p.length;

        for (int i =0; i<k; i++){
            String words = p[i];
            char ch = words.charAt(words.length()-1);
            if (Character.isDigit(ch)){
                continue;
            } System.out.print(ch);
        }



    }
    
}
