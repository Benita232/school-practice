package za.co.wethinkcode.service;

import za.co.wethinkcode.model.Student;
import za.co.wethinkcode.model.SchoolStaff;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SchoolManager {
    private final String schoolName;
    private final List<Student> students;
    private final List<SchoolStaff> staffList;

    // TODO: implement constructor
    // Takes: schoolName
    // Initialise students and staffList as empty ArrayLists

    public SchoolManager(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
        this.staffList = new ArrayList<>();
    }


    // TODO: implement schoolName() getter

    public String schoolName() {
        return schoolName;
    }


    // TODO: implement students() — returns unmodifiable list
    public List<Student> students() {
        return Collections.unmodifiableList(students);
    }

    // TODO: implement staffList() — returns unmodifiable list
    public List<SchoolStaff> staffList() {
        return Collections.unmodifiableList(staffList);
    }

    // TODO: implement addStudent(Student) — adds to students list
    // Throws IllegalArgumentException if student is null
    public void addStudent(Student student) {
        if (student == null) {throw new IllegalArgumentException("Student cannot be null");}
        students.add(student);
    }

    // TODO: implement addStaff(SchoolStaff) — adds to staffList
    // Throws IllegalArgumentException if staff is null
public void addStaff(SchoolStaff staff){
        if (staff == null) throw new IllegalArgumentException("Staff cannot be null");
        staffList.add(staff);
}
    // TODO: implement findStudent(String studentNumber)
    // Returns the Student with matching studentNumber, or null if not found
    public Student findStudent(String studentNumber) {
        for (Student student : students) {
            if (student.studentNumber().equals(studentNumber)) {
                return student;
            }
        }return null;
    }

    // TODO: implement enrolledStudents()
    // Returns a List<Student> of only students where isEnrolled() is true
    public List<Student> enrolledStudents() {
        List<Student> enrolled = new ArrayList<>();
        for (Student student : students) {
            if (student.isEnrolled()) {
                enrolled.add(student);
            }
        }return enrolled;
    }

    // TODO: implement totalMonthlyTuitionRevenue()
    // Returns sum of tuitionFee() for all ENROLLED students only
    public double totalMonthlyTuitionRevenue() {
        double tuition = 0;
        for (Student student : students) {
            if (student.isEnrolled()) {
                tuition += student.tuitionFee();
            }
        }return tuition;
    }


    // TODO: implement totalMonthlyStaffCost()
    // Returns sum of monthlySalary() for all staff
    public  double totalMonthlyStaffCost() {
        double cost = 0;
        for (SchoolStaff staff : staffList) {
            cost += staff.monthlySalary();
        }

        return cost;

    }
}
