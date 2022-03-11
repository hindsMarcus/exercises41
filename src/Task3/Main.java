package Task3;

import java.util.ArrayList;

public class Main {

    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String args[]) {

        Customer customer1 = new Customer("Marcus", "Hindsbøl", "mh");
        Customer customer2 = new Customer("Andreas", "Lowe", "al");
        Customer customer3 = new Customer("Christian", "Larsen", "cl");
        Customer customer4 = new Customer("Victor", "Petersen", "vp");
        Customer customer5 = new Customer("Kalle", "Sørensen", "ks");
        Customer customer6 = new Customer("Philip", "Bruhn", "pb");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        printAllCustomers();
    }

    public static void printAllCustomers() {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}
