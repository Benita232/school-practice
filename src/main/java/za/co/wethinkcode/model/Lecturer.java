package za.co.wethinkcode.model;

public class Lecturer extends SchoolStaff {
    // TODO: declare BASE_SALARY constant = 35000.00
    public static final double BASE_SALARY = 35000.00;
    // TODO: declare SALARY_PER_YEAR constant = 1200.00
    public static final double SALARY_PER_YEAR = 1200.00;


    // TODO: declare private mutable field: subject (String)
    private String subject;

    // TODO: implement constructor
    // Takes: firstName, lastName, email, phoneNumber, employeeId, yearsOfService, subject

    public Lecturer(String firstName, String lastName, String email, String phoneNumber, String employeeId, int yearsOfService, String subject) {
        super(firstName, lastName, email, phoneNumber, employeeId, yearsOfService);
        updateSubject(subject);
    }
    // TODO: implement subject() getter

    public String subject() {
        return subject;
    }

    public void updateSubject(String subject) {
        this.subject = subject;
    }


    // TODO: implement updateSubject(String) setter

    @Override
    public double monthlySalary() {
        return BASE_SALARY +(yearsOfService() * SALARY_PER_YEAR);
    }

    // TODO: override monthlySalary() — BASE_SALARY + (yearsOfService() * SALARY_PER_YEAR)


    // TODO: override department() — returns "Academic"

    @Override
    public String department() {
        return "Academic";
    }


    // TODO: override duties() — returns "Lecturing, marking, and student mentorship"

    @Override
    public String duties() {
        return "Lecturing, marking, and student mentorship";
    }

    // TODO: override role() — returns "Lecturer ("+subject+")"

    @Override
    public String role() {
        return "Lecturer (" + subject + ")";
    }

    // TODO: override toString() — returns "Lecturer{"+employeeId()+"}"

    @Override
    public String toString() {
        return "Lecturer{" +
               employeeId() +
                '}';
    }
}
