package Task3;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int ID;

    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Chosen user: " + userName + " - Name: " + firstName + " " + lastName;
    }
}
