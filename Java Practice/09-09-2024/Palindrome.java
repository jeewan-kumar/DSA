public class Palindrome {
    public static void main(String[] args) {
        int n = 1001;
        if(isPalindrome(n)){
            System.out.println(n +" : is a Palindrome Number");
        } else {
            System.out.println(n +" : is not a Palindrome Number");
        }
    }
    static boolean isPalindrome(int n){
        int org = n;
        int result = 0;
        for(int a = n; a>0;a/=10){
            int rem = a%2;
            result=result*10+rem;           
        }
        return result == org;
    }
}
