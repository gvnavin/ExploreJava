package gvnavin.java8.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static gvnavin.java8.predicates.EmployeePredicate.filterEmployees;
import static gvnavin.java8.predicates.EmployeePredicate.isAdultFemale;
import static gvnavin.java8.predicates.EmployeePredicate.isAdultMale;
import static gvnavin.java8.predicates.EmployeePredicate.isAgeMoreThan;

/**
 * Created by gnavin on 5/15/16.
 */
public class TestEmployeePredicate {
    public static void main(final String[] args) {
        final Employee e1 = new Employee(1, 23, "M", "Rick", "Beethovan");
        final Employee e2 = new Employee(2, 13, "F", "Martina", "Hengis");
        final Employee e3 = new Employee(3, 43, "M", "Ricky", "Martin");
        final Employee e4 = new Employee(4, 26, "M", "Jon", "Lowman");
        final Employee e5 = new Employee(5, 19, "F", "Cristine", "Maria");
        final Employee e6 = new Employee(6, 15, "M", "David", "Feezor");
        final Employee e7 = new Employee(7, 68, "F", "Melissa", "Roy");
        final Employee e8 = new Employee(8, 79, "M", "Alex", "Gussin");
        final Employee e9 = new Employee(9, 15, "F", "Neetu", "Singh");
        final Employee e10 = new Employee(10, 45, "M", "Naveen", "Jain");
        
        final List<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee[] { e1, e2, e3, e4, e5, e6, e7, e8, e9, e10 }));
        
        System.out.println(filterEmployees(employees, isAdultMale()));
        
        System.out.println(filterEmployees(employees, isAdultFemale()));
        
        System.out.println(filterEmployees(employees, isAgeMoreThan(35)));
        
        //Employees other than above collection of "isAgeMoreThan(35)" can be get using negate()
        System.out.println(filterEmployees(employees, isAgeMoreThan(35).negate()));
    }
    
}
