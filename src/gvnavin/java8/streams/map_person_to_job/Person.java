package gvnavin.java8.streams.map_person_to_job;

/**
 * Created by gnavin on 7/4/16.
 */
public class Person {

    private int personId;
    private String jobDescription;

    public Person(final int personId, final String jobDescription) {
        this.personId = personId;
        this.jobDescription = jobDescription;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(final int personId) {
        this.personId = personId;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(final String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "Person {" +
                "personId=" + personId +
                ", jobDescription='" + jobDescription + '\'' +
                '}';
    }
}
