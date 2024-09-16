public class ReverseArray {
    public static void main(String[] args) {
        int list[] = { 45,65,88,95,65};
        reverseArray(list);
        

    }
    static void reverseArray(int list[]){
        for(int i = list.length-1; i>=0;i--){
            System.out.print(list[i]+", ");
        }
    }
}
