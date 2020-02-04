package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 255, message = "Qty of symbols are limited by 255")
    public String description;


    //constructors

    public Skill() {};

    public Skill(String name, String description) {
        super(name);
        this.description = description;
    }

    //getters and setters


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}