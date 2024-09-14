public class TypeOfConstructors {
    public static void main(String[] args) {
        Students s = new Student();
        Students s1 = new Student( "jeewan");
        Students s2 = new Student("jeewan",45);

    }
}

class Students {
    String name;
    int roll;
    int marks;
    Students(){
        System.out.println("Non parameterized constructer");
    }
    Students(String name){
        System.out.print("This is a parameterized constructer");
    }
    Students(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
}

