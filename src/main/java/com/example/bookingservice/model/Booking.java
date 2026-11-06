package com.example.bookingservice.model;

import com.sun.org.apache.xerces.internal.impl.dv.xs.IDDV;

public class Booking {
    @NotBlank
    @Min(2)
    @Max (60) private string organiser_name;

    @NotBlank private int attendee_count;

    @NotBlank private int room_ID;

    @NotBlank private string status;

    public Booking(string organiser_name, int attendee_count, int room_ID, string status) {
        this.organiser_name = organiser_name;
        this.attendee_count = attendee_count;
        this.room_ID = room_ID;
        this.status = status;
    }

    public Booking() {
    }

    public string getOrganiser_name() {
        return organiser_name;
    }

    public void setOrganiser_name(string organiser_name) {
        this.organiser_name = organiser_name;
    }

    public int getAttendee_count() {
        return attendee_count;
    }

    public void setAttendee_count(int attendee_count) {
        this.attendee_count = attendee_count;
    }

    public int getRoom_ID() {
        return room_ID;
    }

    public void setRoom_ID(int room_ID) {
        this.room_ID = room_ID;
    }

    public string getStatus() {
        return status;
    }

    public void setStatus(string status) {
        this.status = status;
    }
}
