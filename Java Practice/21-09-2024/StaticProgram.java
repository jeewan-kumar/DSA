class StaticProgram{
    static{
        System.out.println("Hello Jeewan");
        System.out.println(sum(4,5));
        System.exit(0);
    }
    static int sum(int a, int b){
        return a+b;
    }
}