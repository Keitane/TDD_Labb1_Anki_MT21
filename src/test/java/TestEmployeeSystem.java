import org.junit.jupiter.api.*;

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
    }

    @Test
    public void checkGetEmployeeListTest() {
    }
}
