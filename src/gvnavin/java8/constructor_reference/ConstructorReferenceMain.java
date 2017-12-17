package gvnavin.java8.constructor_reference;

/**
 * Created by gnavin on 5/14/16.
 */
public class ConstructorReferenceMain {

    public static void main(String[] args) {
        
        //constructor reference passed using "new" keyword and "::"
        PersonFactory<Person> personFactory5= Person::new;
        Person person5 = personFactory5.create("Peter", "Parker");
    
        tillJava7();
    
        otherWays();
    }
    
    private static void otherWays() {
        PersonFactory<Person> personFactory2 = (String firstName, String lastName) -> {
            return new Person(firstName, lastName);
        };
        Person person2 = personFactory2.create("Peter", "Parker");
        
        PersonFactory<Person> personFactory3 = (String firstName, String lastName) -> new Person(firstName, lastName);
        Person person3 = personFactory3.create("Peter", "Parker");
        
        PersonFactory<Person> personFactory4 = (firstName, lastName) -> new Person(firstName, lastName);
        Person person4 = personFactory4.create("Peter", "Parker");
    }
    
    private static void tillJava7() {
        PersonFactory<Person> personFactory1 = new PersonFactory<Person>() {
            @Override
            public Person create(final String firstName, final String lastName) {
                return new Person(firstName, lastName);
            }
        };
        Person person1 = personFactory1.create("Peter", "Parker");
    }
    
}
