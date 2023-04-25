public class Customer {

        private String FirstName;
        private String LastName;
        private String phone;
        private String email;
        private String license;
        private int age;
        public Customer(String FirstName, String LastName, String phone, String email, String liscense, int age) {
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.phone = phone;
            this.email = email;
            this.license = liscense;
            this.age = age;
        }
        public String getCustomerInfo() {
            return String.format("Name: %s %s\n" +
                    "Phone: %s\n" +
                    "Email: %s\n" +
                    "Liscense: %s\n" +
                    "Age: %d\n",
                    FirstName, LastName, phone, email, license, age);
        }
        public int getAge() {
            return age;
        }
        public String getFirstName() {
            return FirstName;
        }
        public String getLastName() {
            return LastName;
        }
}

