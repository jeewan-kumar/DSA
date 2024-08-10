class ReverseTheInteger {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = reverse(num);
        System.out.println("Original number is: " + num);
        System.out.println("Reversed number is: " + reversed);
    }

    // static int reverse(int num){
    //     int reversed = 0;
    //     while(num != 0) {
    //         int remainder = num % 10;
    //         reversed = reversed * 10 + remainder;
    //         num = num / 10;
    //     }
    //     return reversed;
    // }

    static int reverse (int num){
        int reversed = 0;
        for(int a = 0; num!=0;a++){
            int remainder = num%10;
            reversed = remainder * 10 + remainder;
            num = num/10;

        }
        return reversed;
    }

    // static int reverse(int num) {
    //     int reversed = 0;
    //     for (int a = 0; num != 0; a++) {
    //         int remainder = num % 10;
    //         reversed = reversed * 10 + remainder; // Corrected this line
    //         num = num / 10;
    //     }
    //     return reversed;
    // }
}