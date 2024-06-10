package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank
    @Size(min=1, max=50, message = "Must be between 1 to 50 characters")
    private String location;

    public Employer(String location) {
        this.location = location;
    }

    public Employer (){};

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
