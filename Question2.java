// WAP To PRint star right half pattern 
public class Question2{
    public static void pattern(int n){
        for (int i=1; i<= n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        int n=5;
        pattern(n);
    }
}