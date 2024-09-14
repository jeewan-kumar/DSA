public class Program2 {
    public static void main(String[] args) {
        int num[] = {85, 65, 78, 99, 85, 100, 65, 78};
        int sum = 0;

        for(int i = 0; i<= num.length-1;i++){
            System.out.print(num[i]+", ");
        }
        for(int i = 0; i<= num.length-1;i++){
            sum +=num[i];
        }
        System.out.println("\n Sum of Array : "+sum);
    }
}
