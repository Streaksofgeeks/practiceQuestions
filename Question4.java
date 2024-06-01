//WAP to create a number right triangle pattern.
public class Question4 {
    public static void sawaal(int n){
        int i,j;
        for (i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n=5;
        sawaal(n);


    }
}
