package za.co.wethinkcode.model;

public abstract class Person {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phoneNumber;

    public Person(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String firstName() { return firstName; }
    public String lastName() { return lastName; }
    public String email() { return email; }
    public String phoneNumber() { return phoneNumber; }

    public abstract String role();

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + email + ")";
    }
}
