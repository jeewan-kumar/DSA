public class Child extends Dad {
    int childMondy;
    Child(int i){
        super();
        // System.out.println(i);
        childMondy = i;
        System.out.println(childMondy);
        System.out.println("hii child constructer");
    }
    Child(){
        System.out.println("child constructer");
    }
    
}
