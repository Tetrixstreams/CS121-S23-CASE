lic class Test {
    public static void main(String[] args) {
        CustomerRecord customerRecord = new CustomerRecord();
        customerRecord.addCustomer(new Customer("drake", "afflack", "555-2343", "aff@gmail.com", "yes", 18));
        customerRecord.addCustomer(new Customer("chad", "bentenison", "555-3264", "benny@gmail.com", "yes", 24));

        System.out.println(customerRecord.getAllCustomersInfo());
        //asking to make it void.
    }
}