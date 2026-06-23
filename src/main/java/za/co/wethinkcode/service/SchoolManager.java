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

    // TODO: implement schoolName() getter

    // TODO: implement students() — returns unmodifiable list

    // TODO: implement staffList() — returns unmodifiable list

    // TODO: implement addStudent(Student) — adds to students list
    // Throws IllegalArgumentException if student is null

    // TODO: implement addStaff(SchoolStaff) — adds to staffList
    // Throws IllegalArgumentException if staff is null

    // TODO: implement findStudent(String studentNumber)
    // Returns the Student with matching studentNumber, or null if not found

    // TODO: implement enrolledStudents()
    // Returns a List<Student> of only students where isEnrolled() is true

    // TODO: implement totalMonthlyTuitionRevenue()
    // Returns sum of tuitionFee() for all ENROLLED students only

    // TODO: implement totalMonthlyStaffCost()
    // Returns sum of monthlySalary() for all staff
}
