package functionalinterface;

import java.util.function.Consumer;

/**
 * @author Mohammed Amr
 * @created 15/12/2020 - 22:38
 * @project javafunctional
 */
public class _Consumer {

    public static void main(String[] args) {

        // Normal java function
        Customer maria = new Customer("Maria", "99999");
        greatCustomer(maria);

        // Consumer Functional Interface
        greetCustomerConsumer.accept(maria);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);

    static void greatCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);
    }

    static class Customer {

        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

    }

}
