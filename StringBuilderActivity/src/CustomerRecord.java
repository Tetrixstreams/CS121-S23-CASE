import java.util.ArrayList;
public class CustomerRecord {

//Array list of customers

private ArrayList<Customer> allCustomer = new ArrayList();

//A way to add customers to the list

public void addCustomer(Customer customer) { allCustomer.add(customer); }

//Method that returns customers info from the list using string builder


    public String getAllCustomerInfo() {
        StringBuilder strBuilder = new StringBuilder();
        for (Customer customer : allCustomer) {
            strBuilder.append(customer.getCustomerInfo());
            System.out.println();
        }
        return strBuilder.toString();
    }
}
