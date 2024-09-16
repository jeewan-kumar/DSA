public class ReverseArray_Optimize {
    public static void main(String[] args) {
        int list[] = {2,4,5,6,8};
        reverseArray_Optimize(list);
        for(int i = 0; i<=list.length-1;i++){
            System.out.print(list[i]+", ");
        }
    }

    static void reverseArray_Optimize(int list[]){
        int start = 0, end = list.length-1;

        while (start<end) {
            int temp = list[end];
            list[end]=list[start];
            list[start]=temp;
            end--;
            start++;            
        }


    }
}
