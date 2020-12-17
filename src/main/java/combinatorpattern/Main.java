package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

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

        Customer customer3 = new Customer(
                "bob",
                "bob@gmail.com",
                "+0883838383838",
                LocalDate.of(2015, 1, 1)
        );

        System.out.println(new CustomerValidatorService().isValid(customer1));
        System.out.println(new CustomerValidatorService().isValid(customer2));
        System.out.println(new CustomerValidatorService().isValid(customer3));

        // If valid, we can store customer in DB

        // Using Combinator Pattern
        ValidationResult result1 = isEmaiValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer1);

        System.out.println(result1);

        ValidationResult result2 = isEmaiValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer2);

        System.out.println(result2);

        ValidationResult result3 = isEmaiValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer3);

        System.out.println(result3);

        if (result1 != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result1.name());
        }

        if (result2 != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result2.name());
        }

        /*if (result3 != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result3.name());
        }*/
    }
}
