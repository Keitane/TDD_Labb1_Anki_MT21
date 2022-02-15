import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

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
}
