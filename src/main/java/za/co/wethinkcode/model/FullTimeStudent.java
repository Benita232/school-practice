package za.co.wethinkcode.model;

public class FullTimeStudent extends Student {
    // TODO: declare TUITION_FEE constant = 45000.00
public static final double TUITION_FEE = 45000.0;
    // TODO: declare private mutable field: major (String)
private String major;

    public FullTimeStudent(String firstName, String lastName, String email, String phoneNumber, String studentNumber, String major) {
        super(firstName, lastName, email, phoneNumber, studentNumber);
        updateMajor(major);
    }
// TODO: implement constructor
    // Takes: firstName, lastName, email, phoneNumber, studentNumber, major


    // TODO: implement major() getter
    public String major() {
        return major;
    }
    public void updateMajor(String major) {
        this.major = major;
    }

    // TODO: implement updateMajor(String) setter

    // TODO: override tuitionFee() — returns TUITION_FEE

    @Override
    public double tuitionFee() {
        return TUITION_FEE;
    }


    // TODO: override programme() — returns "Full Time ("+major+")"

    @Override
    public String programme() {
        return "Full Time ("+major+ ")";
    }


    // TODO: override role() — returns "Full Time Student"

    @Override
    public String role() {
        return "Full Time Student";
    }


    // TODO: override toString() — returns "FullTimeStudent{"+studentNumber()+"}"

    @Override
    public String toString() {
        return "FullTimeStudent{" + studentNumber() + "}"
               ;
    }
}

