public class FloydTriangle {
    public static void main(String[] args) {
        int row = 5;
        int a =1;
        for(int i = 1; i<=row; i++){
            
            for(int j = 1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
           
        }
    }
}
