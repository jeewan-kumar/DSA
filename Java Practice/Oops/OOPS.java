public class OOPS{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.getColor());
        p1.setTip(10);
        System.out.println(p1.getTip());

        BankAccount bank = new BankAccount();
        bank.userName="jeewan";
        bank.setPassword("jeewan");

        System.err.println(bank.userName);
    }
    
}

class Pen {
    private String color;
    private int tip;

    String getColor(){
        return this.color;
        
    }

    int getTip(){
        return this.tip;
    }

    void setColor (String newColor){
        color = newColor;
    }
    void setTip (int newTip){
        tip = newTip;
    }
}

class BankAccount {
    public String userName;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
    

}