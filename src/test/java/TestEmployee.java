import org.junit.jupiter.api.*;

public class TestEmployee {

    Employee testObject1;
    Employee testObject2;
    Employee testObject3;


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
        testObject2 = new Employee("Marcus", "Davidsson", 33, 10500.00);
        testObject3 = new Employee("Jakob", "Nilsson", 23, 10500.00);

    }


    @Test
    public void checkGetUniqueIDTest2() {
        int actual2 = testObject2.getUniqueID();

        int expected1 = actual2 - 1;
        int expected3 = actual2 + 1;

        int actual1 = testObject1.getUniqueID();
        int actual3 = testObject3.getUniqueID();

        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    public void checkGetFirstNameTest() {
        String expected = "Anki";
        String actual = testObject1.getFirstName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSetFirstNameTest() {
        String expected = "Yae";

        testObject1.setFirstName(expected);

        String actual = testObject1.getFirstName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkGetLastNameTest(){
        String expected = "Phan";

        String actual = testObject1.getLastName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSetLastNameTest() {
        String expected = "Miko";

        testObject1.setLastName(expected);

        String actual = testObject1.getLastName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkGetAgeTest() {
        int expected = 24;

        int actual = testObject1.getAge();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSetAgeTest() {
        int expected = 25;

        testObject1.setAge(expected);

        int actual = testObject1.getAge();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkGetSalaryTest() {
        double expected = 10500.00;

        double actual = testObject1.getSalary();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSetSalaryTest() {
        double expected = 14500.00;

        testObject1.setSalary(expected);

        double actual = testObject1.getSalary();

        Assertions.assertEquals(expected, actual);
    }
}
