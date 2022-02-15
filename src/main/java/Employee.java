public class Employee {

    private int ID;
    private static int counter;

    public Employee(String name, String lastName, int age, double salary) {
    counter = counter + 1;
    ID = counter;
    }

    public int getUniqueID() {
        return ID;
    }
}
