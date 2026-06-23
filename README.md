# OOP Practice — School Management System

## Description

This project is an Object-Oriented Programming exercise based on a School Management System.
It demonstrates the use of inheritance, method overriding, abstract classes, and service layer design in Java.

---

## Class Hierarchy

```
Person (abstract)
├── Student (abstract)
│   ├── FullTimeStudent
│   └── PartTimeStudent
└── SchoolStaff (abstract)
    └── Lecturer

SchoolManager (service)
```

---

## Requirements

- Java 17
- Maven 3.x

---

## How to Run Tests

```bash
mvn test
```

---

## Project Structure

```
src/
├── main/java/za/co/wethinkcode/
│   ├── model/
│   │   ├── Person.java          (given)
│   │   ├── Student.java         (given)
│   │   ├── SchoolStaff.java     (given)
│   │   ├── FullTimeStudent.java (implement)
│   │   ├── PartTimeStudent.java (implement)
│   │   └── Lecturer.java        (implement)
│   └── service/
│       └── SchoolManager.java   (implement)
└── test/java/za/co/wethinkcode/
    ├── StudentTest.java
    ├── StaffTest.java
    └── SchoolManagerTest.java
```

---

## Implementation Steps

### Step 1 — Implement `FullTimeStudent`
- Extends `Student`
- Constant: `TUITION_FEE = 45000.00`
- Field: `major` (mutable)
- Override: `tuitionFee()`, `programme()`, `role()`, `toString()`

### Step 2 — Implement `PartTimeStudent`
- Extends `Student`
- Constant: `TUITION_FEE = 22500.00`
- Field: `employer` (mutable)
- Override: `tuitionFee()`, `programme()`, `role()`, `toString()`

### Step 3 — Implement `Lecturer`
- Extends `SchoolStaff`
- Constants: `BASE_SALARY = 35000.00`, `SALARY_PER_YEAR = 1200.00`
- Field: `subject` (mutable)
- Override: `monthlySalary()`, `department()`, `duties()`, `role()`, `toString()`

### Step 4 — Implement `SchoolManager`
- Manages lists of `Student` and `SchoolStaff`
- Methods: `addStudent()`, `addStaff()`, `findStudent()`, `enrolledStudents()`, `totalMonthlyTuitionRevenue()`, `totalMonthlyStaffCost()`

---

## Author

Benita Nnabuife  
WeThinkCode_ — JHB-06  
[github.com/Benita232](https://github.com/Benita232)