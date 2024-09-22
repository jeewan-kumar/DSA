public class MaxSubarraySum {
    public static void main(String[] args) {
        // int list[] = {1, -2, 6, -1, 3}; 
        int list[] = {2, 4, 6, 8, 10};
        System.out.println(maxSubarraySum(list));
    }
    public static int maxSubarraySum(int list[]){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<=list.length-1;i++){
            for(int j = i; j<=list.length-1;j++){
                int sum = 0;
                for(int k = i; k<=j;k++){
                    sum+=list[k];
                    
                }
                System.out.println(sum);
                if(max<sum){
                    max=sum;
                }
            }
        }
        return max;
    }
}
