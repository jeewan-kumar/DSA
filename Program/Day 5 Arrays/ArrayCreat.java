public class ArrayCreat {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Declaration of Array : ");
        array[0] = 10;
        array[1] = 20;
        array[9] = 30;
        for (int i = 0; i <array.length ; i++) {
            System.out.print((array[i]));
        }
    }
}
