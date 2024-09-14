public class MethodOverriding {
    public static void main(String[] args) {
        child c = new child();
        c.money();
        
    }
}

class parent {
    void money(){
        System.out.println(5);
    }
}

class child extends parent {
    void money(){
        System.out.println(10);
    }
}