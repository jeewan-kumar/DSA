public class ShallowCopyAddress {
    String city;
    String street;

    //constructor
    public ShallowCopyAddress (String city, String street){
        this.city = city;
        this.street = street;

    }

    public void display(){
        System.out.println("City: "+city+", Street: "+ street);
    }

}

class ShallowCopyPerson {
    String name;
    ShallowCopyAddress address;

    //constructor
    public ShallowCopyPerson(String name, ShallowCopyAddress address){
        this.name = name;
        this.address = address;
    }

    public ShallowCopyPerson shallowCopy(){
        return new ShallowCopyPerson(this.name, this.address);
    }

    public void display(){
        System.out.println("Name: " +name);
        address.display();
    }

    public static void main(String[] args) {
        ShallowCopyAddress add = new ShallowCopyAddress("New York", "5th Avenue" );
        ShallowCopyPerson per = new ShallowCopyPerson("John", add);

        //create a shallow copy
        ShallowCopyPerson copyPerson = per.shallowCopy();

        //Display both Persons
        System.out.println("Original Person: ");
        per.display();
        System.out.println("Shallow Copied Person: ");
        copyPerson.display();
    }
}
