public class BinarySearch {
    public static void main(String[] args) {
        int list[] = {45,65,85,98,99};
        int key = 99;
        System.out.println(binarySearch(list,key));
    }
    static int binarySearch(int list[], int key){
        int start = 0, end = list.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if(list[mid] == key){
                return mid;
            }
            if(list[mid] < key){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
