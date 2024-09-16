
public class LinearSearch {
    public static void main(String[] args) {
        int listOfNumber[] = {45,65,85,66,95,100};
        int key = 95;
        if(search(listOfNumber, key)==true)
        System.out.println("Number found");
        else
        System.out.println("Number not found");
    }
    static boolean search(int listOfNumber[], int key){
        
        for(int i = 0; i<listOfNumber.length;i++){
            if(listOfNumber[i]==key){
                return true;
            }
        }
        return false;
    }
    
}