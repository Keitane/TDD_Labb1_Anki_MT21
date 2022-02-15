import org.junit.jupiter.api.*;

public class TestEmployee {

    Employee testObject1;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Nu börjar vi: ");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Nu slutar vi: ");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Slut: ");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Start: ");

        testObject1 = new Employee("Anki", "Phan", 24, 10500.00);

    }

    @Test
    public void checkGetUniqueIDTest() {
        int expected = 1;
        int actual = testObject1.getUniqueID();

    }
}
