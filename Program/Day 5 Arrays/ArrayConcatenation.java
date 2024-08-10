/**
 * ArrayConcatenation
 */

public class ArrayConcatenation {

    public static void main(String[] args) {
        int[] array1 = new int[] { 1, 2, 3, 4, 5,10,15 };
        System.out.println(cons(array1));
        char[] array2 = { 'H', 'e', 'l', 'l', 'o' };
        System.out.println(show(array2));
        String[] str =  {"I","am","a","student"};
        chare(str);
    }

    public static int cons(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length - 1; i++) {
            sum += x[i];
        }
        return sum;
    }

    public static String show(char[] x) {
        String str = "";
        for (int i = 0; i < x.length; i++) {
            str += x[i];
        }
        return str;
    }

    public static void chare(String[] x) {
        for (String s : x) {
            System.out.print(s + ": ");
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i) + " ");
            }
            System.out.println("");
        }
    }
    
}