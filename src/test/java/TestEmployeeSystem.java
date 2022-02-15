import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class TestEmployeeSystem {
    Employee testObject1;
    Employee testObject2;
    Employee testObject3;

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

        int actual = employeeTest.size();
    }

    @Test
    public void checkAddEmployeeTest() {
        int expected = 3;
        ArrayList<Employee> employeesTest = new ArrayList<Employee>();

        testObjectSystem.addEmployee(testObject1);
        testObjectSystem.addEmployee(testObject2);
        testObjectSystem.addEmployee(testObject3);

        employeesTest = testObjectSystem.getEmployeeList();

        int actual = employeesTest.size();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkRemoveEmployeeTest() {
        int expected = 2;
        ArrayList<Employee> employeesTest = new ArrayList<Employee>();

        testObjectSystem.addEmployee(testObject1);
        testObjectSystem.addEmployee(testObject2);
        testObjectSystem.addEmployee(testObject3);

        testObjectSystem.removeEmployee(testObject1);

        employeesTest = testObjectSystem.getEmployeeList();

        int actual = employeesTest.size();

        Assertions.assertEquals(expected, actual);
    }
}
