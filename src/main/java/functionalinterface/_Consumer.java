package functionalinterface;

import java.util.function.BiConsumer;
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
        greatCustomerV2(maria, false);

        // Consumer Functional Interface
        greetCustomerConsumer.accept(maria);

        greetCustomerConsumerV2.accept(maria, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName
                    + ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "******"));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName
                    + ", thanks for registering phone number "
                    + customer.customerPhoneNumber);

    static void greatCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName
                + ", thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    static void greatCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName
                + ", thanks for registering phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber : "******"));
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
