public class Question5 {
    public static void sawaal(int n){
        int i;
        int j;
        for(i=n; i>=1; i--){
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
