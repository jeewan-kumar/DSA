class MainPen{
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("blue");
        p.setTip(5);
        System.out.println(p.color);
        System.out.println(p.tip);

        Pen p1 = new Pen();
        p1.color = "Red";
        p1.tip = 4;
        System.out.println(p1.color);
        System.out.println(p1.tip);
        
    }
}


class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}