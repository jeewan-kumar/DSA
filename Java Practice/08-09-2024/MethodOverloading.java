public class MethodOverloading {
    public static void main(String[] args) {
        Sum s = new Sum();
        s.sum(4, 10);
        s.sum(8.6, 8);
        s.sum(4, 10,15);
        
    }
}

class Sum {
    void sum(int a , int b){
        System.out.println(a+b);
    }

    void sum(double a , double b){
        System.out.println(a+b);
    }

    void sum(int a , int b , int c){
        System.out.println(a+b+c);
    }
}