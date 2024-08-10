public class NoMain {
    static {
        int a = 10;
        System.out.println(a*a);
        System.out.println("Hello, this is executed without a main method.");
        System.exit(0); 
    }
}
