package za.co.wethinkcode;

import org.junit.jupiter.api.*;
import za.co.wethinkcode.model.*;
import za.co.wethinkcode.service.*;
import static org.junit.jupiter.api.Assertions.*;

public class SchoolManagerTest {
    private SchoolManager manager;
    private FullTimeStudent student1;
    private PartTimeStudent student2;
    private Lecturer lecturer;

    @BeforeEach
    void setUp() {
        manager = new SchoolManager("WeThinkCode_");
        student1 = new FullTimeStudent("Benita", "Nnabuife", "benita@wtc.co.za", "0681234567", "STU-001", "Software Engineering");
        student2 = new PartTimeStudent("Thabo", "Mokoena", "thabo@wtc.co.za", "0729876543", "STU-002", "FNB");
        lecturer = new Lecturer("Sipho", "Dlamini", "sipho@wtc.co.za", "0711234567", "EMP-001", 5, "Java Programming");
        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStaff(lecturer);
    }

    @Test void schoolNameCorrect() { assertEquals("WeThinkCode_", manager.schoolName()); }
    @Test void addStudentIncreasesCount() { assertEquals(2, manager.students().size()); }
    @Test void addStaffIncreasesCount() { assertEquals(1, manager.staffList().size()); }
    @Test void addNullStudentThrows() {
        assertThrows(IllegalArgumentException.class, () -> manager.addStudent(null));
    }
    @Test void addNullStaffThrows() {
        assertThrows(IllegalArgumentException.class, () -> manager.addStaff(null));
    }
    @Test void findStudentReturnsCorrectStudent() {
        assertEquals(student1, manager.findStudent("STU-001"));
    }
    @Test void findStudentReturnsNullIfNotFound() {
        assertNull(manager.findStudent("STU-999"));
    }
    @Test void enrolledStudentsCorrect() {
        student2.withdraw();
        assertEquals(1, manager.enrolledStudents().size());
    }
    @Test void totalTuitionRevenueCorrect() {
        assertEquals(45000.00 + 22500.00, manager.totalMonthlyTuitionRevenue());
    }
    @Test void totalTuitionExcludesWithdrawn() {
        student2.withdraw();
        assertEquals(45000.00, manager.totalMonthlyTuitionRevenue());
    }
    @Test void totalStaffCostCorrect() {
        assertEquals(35000.00 + (5 * 1200.00), manager.totalMonthlyStaffCost());
    }
}
