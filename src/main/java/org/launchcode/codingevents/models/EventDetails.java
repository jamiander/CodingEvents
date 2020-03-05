package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.validation.constraints.*;

@Entity
public class EventDetails extends AbstractEntity {

    @Size(max=500, message = "Description too long.")
    private String eventDescription;

    @NotBlank(message="Email is required.")
    @Email(message = "Invalid email")
    private String contactEmail;

    @Size(max=100, message="Location exceeds the space allowed.")
    private String location;

    @AssertTrue(message="Only include events that require registration.")
    private boolean register;

    @Min(25)
    private int numAttendees;

    public EventDetails() {}

    public EventDetails(@Size(max = 500, message = "Description too long.") String eventDescription, @NotBlank(message = "Email is required.") @Email(message = "Invalid email") String contactEmail, @Size(max = 100, message = "Location exceeds the space allowed.") String location, @AssertTrue(message = "Only include events that require registration.") boolean register, @Min(25) int numAttendees) {
        this.eventDescription = eventDescription;
        this.contactEmail = contactEmail;
        this.location = location;
        this.register = register;
        this.numAttendees = numAttendees;
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

    public void setNumAttendees(int numAttendees) {
        this.numAttendees = numAttendees;
    }
}
