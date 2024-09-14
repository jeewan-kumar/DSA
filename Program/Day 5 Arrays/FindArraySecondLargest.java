/**
 * FindArraySecondLargest
 */
public class FindArraySecondLargest {
    public static void main(String[] args) {
        int nums[] = {45, 85, 98, 100, 55};

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int num:nums){
            if(num > largest){
                secondlargest = largest;
                largest = num;
            } else if(num < largest && num > secondlargest){
                secondlargest = largest;
            }
        }

        System.out.println(secondlargest);
    }
}