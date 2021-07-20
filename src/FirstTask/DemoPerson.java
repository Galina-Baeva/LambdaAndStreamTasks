package FirstTask;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class DemoPerson {
    public static void main(String[] args) {
        List<Person> firstSet = new ArrayList<>();
        firstSet.add(new Person("Maria", 30));
        firstSet.add(new Person("Ivan", 25));
        firstSet.add(new Person("Max", 26));
        firstSet.add(new Person("Ivan", 25));
        firstSet.add(new Person("Anatoliy", 23));
        firstSet.add(new Person("Anna", 19));
        firstSet.add(new Person("Olga", 56));

        List<String> personsNames = firstSet.stream()
                .filter(a -> a.getAge() >= 20 && a.getAge() <= 30)
                .map(a -> a.getName().toUpperCase())
                .distinct()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        personsNames.forEach(System.out::println);

    }
}
