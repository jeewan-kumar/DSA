
public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int list[]={1,2,6,4,5};
    //     int size =  list.length;
    //    if(arrayIsSortedOrNot(list,size)){
    //     System.out.println("array is sorted");
    //    } else {
    //     System.out.println("array is not sorted");
    //    }

       System.out.println(arrayIsSortedOrNot(list, 0));
    }
    // static boolean arrayIsSortedOrNot(int list[],int size){
    //     if(size<=1){
    //         return true;
    //     }
    //     if(list[size-1]<list[size-2]){
    //         return false;
    //     }
    //     return arrayIsSortedOrNot(list, size-1);
    // }
    
    static boolean arrayIsSortedOrNot(int list[],int i){
        if(i == list.length-1){
            return true;
        }
        if(list[i]>list[i+1]){
            return false;
        }

        return arrayIsSortedOrNot(list, i+1);
    }
}