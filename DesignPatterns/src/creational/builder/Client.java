package creational.builder;

/**
 * Created by thomas on 28/02/15.
 */
public class Client {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder("Thomas", "Peikert");
        pb.setAge(25);
        pb.setAddress("Husumer Straße 23, 24941 Flensburg");

        Person thomas = new Person(pb);

        System.out.println(thomas);
    }
}
