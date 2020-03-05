package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
public class Event extends AbstractEntity {

    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 50, message = "Name must be between 3-50 characters.")
    private String name;

    @Size(max=500, message = "Description too long.")
    private String eventDescription;

    @NotBlank(message="Email is required.")
    @Email(message = "Invalid email")
    private String contactEmail;


    @Size(max=100, message="Location exceeds the space allowed.")
    private String location;

    @AssertTrue(message="Only include events that require registration.")
    private boolean register;

    @ManyToOne
    @NotNull(message="Category must be provided.")
    private EventCategory eventCategory;

    @Min(25)
    private int numAttendees;


    public Event(String name, String eventDescription, String contactEmail, String location, boolean register, EventCategory eventCategory, int numAttendees) {
        this.name = name;
        this.eventDescription = eventDescription;
        this.contactEmail = contactEmail;
        this.location = location;
        this.register = register;
        this.eventCategory = eventCategory;
        this.numAttendees = numAttendees;
    }

    public Event() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRegister() {
        return register;
    }

    public void setRegister(boolean register) {
        this.register = register;
    }


    public int getNumAttendees() {
        return numAttendees;
    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    public void setNumAttendees(int numAttendees) {
        this.numAttendees = numAttendees;
    }

    @Override
    public String toString() {
        return name;
    }

}
