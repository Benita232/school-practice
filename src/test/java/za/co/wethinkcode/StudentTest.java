package za.co.wethinkcode;

import org.junit.jupiter.api.*;
import za.co.wethinkcode.model.*;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private FullTimeStudent fullTime;
    private PartTimeStudent partTime;

    @BeforeEach
    void setUp() {
        fullTime = new FullTimeStudent("Benita", "Nnabuife", "benita@wtc.co.za", "0681234567", "STU-001", "Software Engineering");
        partTime = new PartTimeStudent("Thabo", "Mokoena", "thabo@wtc.co.za", "0729876543", "STU-002", "FNB");
    }

    @Test void fullTimeTuitionFeeCorrect() { assertEquals(45000.00, fullTime.tuitionFee()); }
    @Test void fullTimeProgrammeCorrect() { assertEquals("Full Time (Software Engineering)", fullTime.programme()); }
    @Test void fullTimeRoleCorrect() { assertEquals("Full Time Student", fullTime.role()); }
    @Test void fullTimeToStringCorrect() { assertEquals("FullTimeStudent{STU-001}", fullTime.toString()); }
    @Test void fullTimeMajorCorrect() { assertEquals("Software Engineering", fullTime.major()); }
    @Test void fullTimeUpdateMajorCorrect() {
        fullTime.updateMajor("Data Science");
        assertEquals("Data Science", fullTime.major());
    }
    @Test void fullTimeIsEnrolledByDefault() { assertTrue(fullTime.isEnrolled()); }
    @Test void fullTimeWithdrawWorks() {
        fullTime.withdraw();
        assertFalse(fullTime.isEnrolled());
    }
    @Test void fullTimeFirstNameCorrect() { assertEquals("Benita", fullTime.firstName()); }
    @Test void fullTimeStudentNumberCorrect() { assertEquals("STU-001", fullTime.studentNumber()); }

    @Test void partTimeTuitionFeeCorrect() { assertEquals(22500.00, partTime.tuitionFee()); }
    @Test void partTimeProgrammeCorrect() { assertEquals("Part Time (FNB)", partTime.programme()); }
    @Test void partTimeRoleCorrect() { assertEquals("Part Time Student", partTime.role()); }
    @Test void partTimeToStringCorrect() { assertEquals("PartTimeStudent{STU-002}", partTime.toString()); }
    @Test void partTimeEmployerCorrect() { assertEquals("FNB", partTime.employer()); }
    @Test void partTimeUpdateEmployerCorrect() {
        partTime.updateEmployer("Capitec");
        assertEquals("Capitec", partTime.employer());
    }
}
