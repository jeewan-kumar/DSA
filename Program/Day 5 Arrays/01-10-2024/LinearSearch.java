class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {2,4,6,10,12,14,16};
        int key = 10;
        System.out.println(linearSearch(arr,key));
    }
    // static boolean linearSearch(int arr[],int key){
    //     for(int lis:arr){
    //         if(lis==key){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    static int linearSearch(int arr[],int key){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}