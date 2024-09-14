
public class Triangle_0_1 {
public static void main(String[] args) {
    int start = 1;
    int end = 5;
    for(int i = start; i<=end; i++){
        for(int j = start; j<=i;j++){
            if((i+j)%2 == 0 ){
                System.out.print(1 +" ");
            } else {
                System.out.print(0 +" ");
            }
        }
        System.out.println();
    }
}
    
}