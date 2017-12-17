package gvnavin.java8.streams.map_person_to_job;

/**
 * Created by gnavin on 7/4/16.
 */
public class Job {

    private int personId;
    private String description;

    public Job(final int personId, final String description) {
        this.personId = personId;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(final int personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Job {" +
                "personId=" + personId +
                ", description='" + description + '\'' +
                '}';
    }
}
