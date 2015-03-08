package creational.builder;

/**
 * Created by thomas on 28/02/15.
 */
public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;

    public Person(PersonBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.age = builder.getAge();
        this.phone = builder.getPhone();
        this.address = builder.getAddress();
    }

    public String toString() {
        return "Person with name: " + this.firstName + " " + this.lastName + ", age: " + this.age + ", phone: " + this.phone + " and address: " + this.address;
    }
}
