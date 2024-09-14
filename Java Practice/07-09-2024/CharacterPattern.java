public class CharacterPattern {
    public static void main(String[] args) {
        int start =1;
        int end = 5;
        char c = 'A';
        for(int i = start; i<= end; i++){
            for(int j = start; j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.err.println();
        }
    }
}
