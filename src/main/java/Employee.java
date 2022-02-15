public class Employee {

    private int ID;
    private static int counter;
    private String name;

    public Employee(String name, String lastName, int age, double salary) {
    counter = counter + 1;
    ID = counter;
        this.name = name;
    }

    public int getUniqueID() {
        return ID;
    }

    public String getFirstName() {
        return name;
    }
}
