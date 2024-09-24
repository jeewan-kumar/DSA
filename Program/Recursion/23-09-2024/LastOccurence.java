public class LastOccurence {
    public static void main(String[] args) {
        int list[] = { 4, 5, 6, 8, 9, 10, 5, 6, 9, 8 };
        int key = 5;
        int size = list.length-1;
        System.out.println(lastOccurence(list, key, size));
        System.out.println(lastOccurence(list, key, 0,-1));
    }
    static int lastOccurence(int list[], int key, int size){
        if (size <=0){
            return -1;
        }
        if(list[size]==key){
            return size;
        }
        return lastOccurence(list, key, size-1);
    }

    static int lastOccurence(int list[], int key, int currentIndex,int lastIndex){
        if(currentIndex >= list.length){
            return lastIndex;
        }
        if(list[currentIndex] == key){
            lastIndex = currentIndex;
        }
        return lastOccurence(list, key, currentIndex+1, lastIndex);
    }
}
