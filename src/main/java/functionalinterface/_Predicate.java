package functionalinterface;

import java.util.function.Predicate;

/**
 * @author Mohammed Amr
 * @created 16/12/2020 - 19:41
 * @project javafunctional
 */
public class _Predicate {

    public static void main(String[] args) {

        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("090009800000"));

        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("090009800000"));

        System.out.println("Chaining Predicates!");
        System.out.println(
                "Is phone number 090009800000 valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3Predicate).test("090009800000")
        );

        System.out.println(
                "Is phone number 07000000003 valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.and(containsNumber3Predicate).test("07000000003")
        );

        System.out.println(
                "Is phone number 07000000000 valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.or(containsNumber3Predicate).test("07000000000")
        );
    }

    static boolean isPhoneNumberValid(String phoneNumber) {

        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
         phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3Predicate = phoneNumber ->
            phoneNumber.contains("3");
}
