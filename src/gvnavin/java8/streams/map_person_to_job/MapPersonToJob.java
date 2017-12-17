package gvnavin.java8.streams.map_person_to_job;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by gnavin on 7/4/16.
 */
public class MapPersonToJob {

    static Function<Person, Job> MAP_PERSON_TO_JOB = person -> {
        Job job = new Job(person.getPersonId(), person.getJobDescription());
        System.out.println("job = " + job);
        return job;
    };

    public static void main(String[] args) {
        mapPersonsToJobsUsingStream();
        mapOnePersonToJob();
    }

    public static void mapPersonsToJobsUsingStream() {

        List<Person> persons = new ArrayList<Person>() {{
            add(new Person(1, "Husband"));
            add(new Person(2, "Dad"));
            add(new Person(3, "Software engineer"));
            add(new Person(4, "Adjunct instructor"));
            add(new Person(5, "Pepperoni hanger"));
        }};
        System.out.println("persons = " + persons);

        List<Job> jobs = persons.stream()
                                .map(MAP_PERSON_TO_JOB)
                                .collect(Collectors.toList());

        System.out.println("jobs = " + jobs);
    }

    public static void mapOnePersonToJob() {
        Person person = new Person(1, "Description");
        Job job = MAP_PERSON_TO_JOB.apply(person);
        System.out.println("Description : " + job.getDescription());
    }
}
