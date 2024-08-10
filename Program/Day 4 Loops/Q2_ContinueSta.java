public class Q2_ContinueSta {
    public static void main(String[] args) {
        int i = 0;
        while (i<10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
