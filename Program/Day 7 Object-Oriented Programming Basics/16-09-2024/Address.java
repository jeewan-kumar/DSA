class Address {
    String city;
    String street;

    // Constructor
    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public void display() {
        System.out.println("City: " + city + ", Street: " + street);
    }
}

class Person {
    String name;
    Address address;

    // Constructor
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy method
    public Person shallowCopy() {
        return new Person(this.name, this.address);  // Copy references
    }

    public void display() {
        System.out.println("Name: " + name);
        address.display();
    }

    public static void main(String[] args) {
        Address addr1 = new Address("New York", "5th Avenue");
        Person originalPerson = new Person("John", addr1);

        // Create a shallow copy
        Person shallowCopiedPerson = originalPerson.shallowCopy();

        // Display both persons
        System.out.println("Original Person:");
        originalPerson.display();
        System.out.println("Shallow Copied Person:");
        shallowCopiedPerson.display();

        // Modify the address of the original person
        originalPerson.address.city = "Los Angeles";

        System.out.println("\nAfter modifying the original person's address:");
        System.out.println("Original Person:");
        originalPerson.display();
        System.out.println("Shallow Copied Person:");
        shallowCopiedPerson.display();
    }
}
