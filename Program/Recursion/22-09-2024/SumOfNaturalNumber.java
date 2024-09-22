class SumOfNaturalNumber {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(sumOfNumber(num));;
    }
    static int sumOfNumber(int num){
        if(num==0){
            return 0;
        }        
        return num+sumOfNumber(num-1);
    }
}