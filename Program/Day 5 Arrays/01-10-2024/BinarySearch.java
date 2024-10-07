public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println(binarySearch(arr,key));
    }
    static int binarySearch(int arr[], int key){
        int len = arr.length-1;
        for(int i = 0;i<len;i++){
            int mid = len/2;

            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                return mid;
            }
            if(arr[mid]>key){
                return mid;
            }
        }
        return -1;
    }
}
