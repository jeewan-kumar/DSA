
public class FirstOccurence {
    public static void main(String[] args) {
        int list[] = {4,5,6,8,9,10,5,6,9,8};
        int key = 5;
        System.out.println(firstOccurence(list,key,0));

        // if(firstOccurence(list,key,0)){
        //     System.out.println("Getting the key");
        // } else {
        //     System.out.println("not getting");
        // }
    }
    static int firstOccurence(int list[], int key, int i){
        if(i == list.length-1){
            return -1;
        }
        if(list[i]==key){
            return i;
        }
        return firstOccurence(list, key, i+1);
    }

    // static boolean firstOccurence(int list[], int key, int i){
    //     if(i == list.length-1){
    //         return false;
    //     }
    //     if(list[i]==key){
    //         return true;
    //     }
    //     return firstOccurence(list, key, i+1);
    // }
    
}