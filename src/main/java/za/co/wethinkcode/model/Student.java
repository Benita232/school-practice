package za.co.wethinkcode.model;

public abstract class Student extends Person {
    private final String studentNumber;
    private boolean isEnrolled;

    public Student(String firstName, String lastName, String email, String phoneNumber, String studentNumber) {
        super(firstName, lastName, email, phoneNumber);
        this.studentNumber = studentNumber;
        this.isEnrolled = true;
    }

    public String studentNumber() { return studentNumber; }
    public boolean isEnrolled() { return isEnrolled; }

    public void enrol() { this.isEnrolled = true; }
    public void withdraw() { this.isEnrolled = false; }

    public abstract double tuitionFee();
    public abstract String programme();
}
