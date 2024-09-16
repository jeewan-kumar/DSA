class LargestNumber{
    public static void main(String[] args) {
        int list[] = {45,65,85,95,55,68};
        System.out.println(largest(list));
    }

    static int largest(int list[]){
        int larg = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i<list.length;i++){
            
            if(list[i]>= larg){
                larg=list[i];
            }

            if(list[i]<= max){
                max=list[i];
            }
        }
        return larg;
    }
}