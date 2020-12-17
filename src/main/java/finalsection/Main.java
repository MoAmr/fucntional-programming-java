package finalsection;

import java.util.function.Consumer;

/**
 * @author Mohammed Amr
 * @created 17/12/2020 - 22:59
 * @project javafunctional
 */
public class Main {

    public static void main(String[] args) {

        hello("John", "Montana", null);

        hello("John", null, value -> {
            System.out.println("No Last Name provided for " + value);
        });

        hello2("John", null,  () -> System.out.println("No Last Name provided!"));

    }

    static void hello(String fistName, String lastName, Consumer<String> callback) {
        System.out.println(fistName);

        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(fistName);
        }
    }

    static void hello2(String fistName, String lastName, Runnable callback) {
        System.out.println(fistName);

        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }

    // JavaScript Function
/*    function hello(firstName, lastName, callback) {
        console.log(fistName);
        if (lastName) {
            console.log(lastName);
        } else {
            callback();
        }
    }*/

}
