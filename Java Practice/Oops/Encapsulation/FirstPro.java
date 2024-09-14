package Encapsulation;

public class FirstPro {
    public static void main(String[] args) {
        Student s = new Student("jeewan");
        System.out.println(s);
        s.name = "jeewan";
        s.roll = 45;
    }
}

class Student {
    String name;
    int roll;
    Student(String name){
        this.name = name;
    }
}
