 
public class DeepCopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "jeewan";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=85;

        System.out.print("S1 makrs : ");
              
        for(int i = 0; i<3;i++){
            System.out.print(s1.marks[i] +", ");
        }

        System.out.print("S2 makrs : ");
        Student s2 = new Student(s1);
        s1.marks[2]=100;
       
        for(int i = 0; i<3;i++){
            System.out.print(s2.marks[i] +", ");
        }
    }
    
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i< marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
    Student(){
        marks = new int[3];
    }
}