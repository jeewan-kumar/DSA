public class SumOfEvenOrOdd {
    public static void main(String[] args) {
        int start = 10; 
        int end = 100;
        int sumofodd = 0;
        int sumofeven = 0;

        for(int i = start; i <= end; i++){
            if(i%2==0){
                sumofeven +=i;
            } else {
                sumofodd+=i;
            }
        }
        System.out.println("Sum of Odd no : "+ sumofodd);
        System.out.println("Sum of even no : "+ sumofeven);
    }
}
