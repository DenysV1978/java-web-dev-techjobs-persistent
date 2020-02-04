package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "location should be present")
    @Size(max = 50, message = "Cannot exceed 50 symbols")
    public String location;

    @OneToMany(mappedBy = "employer") //one employer can have many jobs
    private final List<Job> jobs = new ArrayList<>(); //many jobs! In the part of validation- we can have Employers w/o jobs BUT we cannot have jobs w/o employers

    // constructor

    public Employer(String location, String name) { // here we do not need to include List jobs because it will be automatically created when we tie these two tables - OR by other words we can have employer w/o jobs!

        super();
        this.location = location;

    }

    //constructor for Hibernate
    public Employer() {};  //its funny but this guy does not want to be without default empty constructor at parent


    //getters and setters

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
