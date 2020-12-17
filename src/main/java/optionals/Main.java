package optionals;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author Mohammed Amr
 * @created 16/12/2020 - 23:54
 * @project javafunctional
 */
public class Main {

    public static void main(String[] args) {

        Object value = Optional.ofNullable("Hello")
                .orElseGet(() -> "default value");

        Supplier<IllegalStateException> exception = () -> new IllegalStateException("Exception");

        Object value1 = Optional.ofNullable("Hello")
                .orElseThrow(exception);

        Optional.ofNullable("john@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to: " + email));

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to: " + email),
                        () -> System.out.println("Cannot send email!")

                );
        System.out.println(value);
        System.out.println(value1);
    }
}
