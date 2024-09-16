public class MainBank {
    public static void main(String[] args) {
        BankAccount myBank = new BankAccount();
        myBank.userName = "jeewan";
        myBank.password("kumar");
        System.out.println(myBank.userName);
    }
}

class BankAccount {
    public String userName;
    private String password;
    public void password(String pass){
        password = pass;
        System.out.println(password);
    }
    
}
