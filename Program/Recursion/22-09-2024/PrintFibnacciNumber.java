public class PrintFibnacciNumber {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i<=n;i++){
            System.out.print(printFibnacciNumber(i)+" ");
        }
        
    }
    static int printFibnacciNumber(int n){
        if(n==0){
            return 0;
        } else if(n==1){
            return 1;
        } else {
            return printFibnacciNumber(n-1)+printFibnacciNumber(n-2);
        }
    }
}
