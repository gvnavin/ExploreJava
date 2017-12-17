package gvnavin.java8.predicates;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by gnavin on 5/15/16.
 */
public class EmployeePredicate {
    /*
    1) They move your conditions (sometimes business logic) to a central place. This helps in unit-testing them separately.
    2) Any change need not be duplicated into multiple places. It improves manageability of code.
    3) The code e.g. “filterEmployees(employees, isAdultFemale())” is very much readable than writing a if-else block.
    */

    public static Predicate<Employee> isAdultMale() {
        Predicate<Employee> oldImpl = new Predicate<Employee>() {
            @Override
            public boolean test(final Employee p) {
                return p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
            }
        };
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }

    public static Predicate<Employee> isAdultFemale() {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
    }

    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }

    public static List<Employee> filterEmployees (List<Employee> employees, Predicate<Employee> predicate) {
        return employees.stream().filter( predicate ).collect(Collectors.<Employee>toList());
    }
}
