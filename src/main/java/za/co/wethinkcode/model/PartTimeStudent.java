package za.co.wethinkcode.model;

public class PartTimeStudent extends Student {
    // TODO: declare TUITION_FEE constant = 22500.00
    public static final double TUITION_FEE = 22500.0;

    // TODO: declare private mutable field: employer (String)
    private String employer;

    // TODO: implement constructor
    // Takes: firstName, lastName, email, phoneNumber, studentNumber, employer

    public PartTimeStudent(String firstName, String lastName, String email, String phoneNumber, String studentNumber, String employer) {
        super(firstName, lastName, email, phoneNumber, studentNumber);
        updateEmployer(employer);
    }


    // TODO: implement employer() getter

    public String employer() {
        return employer;
    }

    public void updateEmployer(String employer) {
        this.employer = employer;
    }


    // TODO: implement updateEmployer(String) setter

    // TODO: override tuitionFee() — returns TUITION_FEE

    @Override
    public double tuitionFee() {
        return TUITION_FEE;
    }


    // TODO: override programme() — returns "Part Time ("+employer+")"

    @Override
    public String programme() {
        return "Part Time (" + employer + ")";
    }


    // TODO: override role() — returns "Part Time Student"

    @Override
    public String role() {
        return "Part Time Student";
    }

    // TODO: override toString() — returns "PartTimeStudent{"+studentNumber()+"}"

    @Override
    public String toString() {
        return "PartTimeStudent{" + studentNumber() + "}";
    }
}
