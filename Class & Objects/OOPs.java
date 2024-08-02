
public class OOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
    
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setNewColor(String color){
        this.color = color;
    }

    void setTip (int newTip){
        tip = newTip; 
    }
}



class student  {
    String name;
    int age;
    float percentage;

    void setName(String newName){
        name = newName;
    }

    void setAge(int newAge){
        age = newAge;
    }

    void setPercentage(float newPercentage){
        percentage = newPercentage;
    }
}
