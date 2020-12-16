package streams;

import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

/**
 * @author Mohammed Amr
 * @created 16/12/2020 - 20:53
 * @project javafunctional
 */
public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );


        /*Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = name -> name.length();
        Consumer<String> println = System.out::println;
        IntConsumer println1 = System.out::println;*/

        people.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);



        people.stream()
                .map(person -> person.name)
                .mapToInt(name -> name.length())
                .forEach(System.out::println);

        Predicate<Person> personFemaleGenderPredicate = person -> FEMALE.equals(person.gender);
        Predicate<Person> personPreferNotToSayGenderPredicate = person -> PREFER_NOT_TO_SAY.equals(person.gender);

        boolean containsOnlyFemales = people.stream()
                .allMatch(personFemaleGenderPredicate);

        boolean containsAnyFemales = people.stream()
                .anyMatch(personFemaleGenderPredicate);

        boolean containsPreferNotToSay = people.stream()
                .noneMatch(personPreferNotToSayGenderPredicate);

        System.out.println(containsOnlyFemales);
        System.out.println(containsAnyFemales);
        System.out.println(containsPreferNotToSay);
    }

    static class Person {

        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
