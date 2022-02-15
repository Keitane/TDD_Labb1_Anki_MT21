import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class TestEmployeeSystem {
    Employee testObject1;
    EmployeeSystem testObjectSystem;


    @BeforeAll
    public static void beforeAll() {
        System.out.println("Nu börjar testsviten för Labb 1 i TDD!");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Nu avslutas testsviten!");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Test slut!");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Test start!");

        testObject1 = new Employee("Anki", "Phan", 24, 30500.00);
        testObjectSystem = new EmployeeSystem();
    }

    @Test
    public void checkGetEmployeeListTest() {
        int expected = 3;
        ArrayList<Employee> employeeTest = new ArrayList<Employee>();

        employeeTest = testObjectSystem.getEmployeeList();

    }
}
