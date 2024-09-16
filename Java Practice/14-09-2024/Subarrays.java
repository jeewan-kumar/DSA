public class Subarrays {
    public static void main(String[] args) {
        int list[] = {2,4,6,8,10};
        subarrays(list);
    }
    static void subarrays(int list[]){
        for(int i = 0; i<=list.length-1;i++){
            for(int j=i;j<=list.length-1;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(list[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
