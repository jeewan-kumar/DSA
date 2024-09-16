public class Constructer {
    public static void main(String[] args) {
        Stu s = new Stu("jeewan");

        System.out.println(s.name+ "   "+s.roll);
    }
}

class Stu{
    String name;
    int roll;
    Stu(String name){
        this.name = name;
    }
}