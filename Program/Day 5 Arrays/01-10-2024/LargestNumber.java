public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,5};
        System.out.println(largestNumber(arr));
    }
    static int largestNumber(int arr[]){
        int tem = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>tem){
                tem = arr[i];
            }
        }
        return tem;
    }
}
