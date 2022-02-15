public class Employee {

    private int ID;
    private static int counter;
    private String name;
    private String lastName;

    public Employee(String name, String lastName, int age, double salary) {
    counter = counter + 1;
    ID = counter;
    this.name = name;
    this.lastName = lastName;
    }

    public int getUniqueID() {
        return ID;
    }

    public String getFirstName() {
        return name;
    }

    public void setFirstName(String newName) {
        name = newName;
    }

    public String getLastName() {
        return lastName;

    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }
}
