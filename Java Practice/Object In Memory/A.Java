class A {
    public static void main(String[] args){
        // int a = 10;
        // int b = 20;
        // System.out.println(a+ " "+b);
        // swap(a,b);
        // System.out.println(a+ " "+b);


        Pair p1 = new Pair(10 ,20);
        System.out.println(p1.a+ " "+p1.b);
        swap(p1);
        System.out.println(p1.a+ " "+p1.b);

    }
    public static void swap(Pair p1){
        p1.a = p1.a+p1.b;
        p1.b = p1.a-p1.b;
        p1.a = p1.a-p1.b;

    }
    // public static void swap(int a, int b){
    //     a = a+b;
    //     b = a-b;
    //     a = a-b;

    // }
}