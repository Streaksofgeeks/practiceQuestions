//count the number of words
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string:");
        String a = myObj.nextLine();
        int countWords = a.split("\\s+").length;
        System.out.println("Number of words: " + countWords);
        myObj.close();
    }
}
