package za.co.wethinkcode;

import org.junit.jupiter.api.*;
import za.co.wethinkcode.model.*;
import static org.junit.jupiter.api.Assertions.*;

public class StaffTest {
    private Lecturer lecturer;

    @BeforeEach
    void setUp() {
        lecturer = new Lecturer("Sipho", "Dlamini", "sipho@wtc.co.za", "0711234567", "EMP-001", 5, "Java Programming");
    }

    @Test void lecturerSalaryCorrect() { assertEquals(35000.00 + (5 * 1200.00), lecturer.monthlySalary()); }
    @Test void lecturerDepartmentCorrect() { assertEquals("Academic", lecturer.department()); }
    @Test void lecturerDutiesCorrect() { assertEquals("Lecturing, marking, and student mentorship", lecturer.duties()); }
    @Test void lecturerRoleCorrect() { assertEquals("Lecturer (Java Programming)", lecturer.role()); }
    @Test void lecturerToStringCorrect() { assertEquals("Lecturer{EMP-001}", lecturer.toString()); }
    @Test void lecturerSubjectCorrect() { assertEquals("Java Programming", lecturer.subject()); }
    @Test void lecturerUpdateSubjectCorrect() {
        lecturer.updateSubject("Python");
        assertEquals("Python", lecturer.subject());
    }
    @Test void lecturerYearsOfServiceCorrect() { assertEquals(5, lecturer.yearsOfService()); }
    @Test void lecturerUpdateYearsOfServiceCorrect() {
        lecturer.updateYearsOfService(10);
        assertEquals(10, lecturer.yearsOfService());
    }
    @Test void lecturerUpdateYearsNegativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> lecturer.updateYearsOfService(-1));
    }
}
