class PrintSubarrays {
    public static void main(String[] args) {
        int list[] = {2, 4,5,8,9,5};
        subarray(list);
    }
    public static void subarray(int subarray[]){
        for(int i = 0; i<=subarray.length-1;i++){
            for(int j = i; j<=subarray.length-1;j++){
                System.out.print("[");
                for(int k = i; k<=j; k++){
                    System.out.print(subarray[k]+" ");
                    // if(k!=0){
                    //     System.out.print(",");
                    // }
                }
                System.out.println("]");

            }
            System.out.println();
        }
    }
}