package combinatorpattern;

import java.time.LocalDate;

/**
 * @author Mohammed Amr
 * @created 17/12/2020 - 22:09
 * @project javafunctional
 */
public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0883838383838",
                LocalDate.of(2000, 1, 1)
        );

        Customer customer2 = new Customer(
                "bob",
                "bobgmail.com",
                "883838383838",
                LocalDate.of(2000, 1, 1)
        );

        System.out.println(new CustomerValidatorService().isValid(customer1));
        System.out.println(new CustomerValidatorService().isValid(customer2));

        // If valid, we can store customer in DB

    }
}
