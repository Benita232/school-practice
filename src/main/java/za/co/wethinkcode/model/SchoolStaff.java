package za.co.wethinkcode.model;

public abstract class SchoolStaff extends Person {
    private final String employeeId;
    private int yearsOfService;

    public SchoolStaff(String firstName, String lastName, String email, String phoneNumber,
                       String employeeId, int yearsOfService) {
        super(firstName, lastName, email, phoneNumber);
        this.employeeId = employeeId;
        this.yearsOfService = yearsOfService;
    }

    public String employeeId() { return employeeId; }
    public int yearsOfService() { return yearsOfService; }

    public void updateYearsOfService(int yearsOfService) {
        if (yearsOfService < 0) throw new IllegalArgumentException("Years of service cannot be negative");
        this.yearsOfService = yearsOfService;
    }

    public abstract double monthlySalary();
    public abstract String department();
    public abstract String duties();
}
