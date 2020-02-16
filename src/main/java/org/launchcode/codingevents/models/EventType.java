package org.launchcode.codingevents.models;

public enum EventType {

    CONFERENCE("Conference"),
    WORKSHOP("Workshop"),
    LECTURE("Lecture"),
    MEETUP("Meetup"),
    HAPPYHOUR("Happy Hour");

    private final String displayName;

    EventType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
