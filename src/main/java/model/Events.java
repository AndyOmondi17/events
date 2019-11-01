package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

public class Events {
    private int id;
    private String eventName;
    private String eventLocation;
    private String eventDescription;
    private Date eventDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private int price;
    private File eventPoster;

    public Events(String eventName, String eventLocation, String eventDescription, Date eventDate, LocalTime startTime, LocalTime endTime, int price, File eventPoster) {
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventDescription = eventDescription;
        this.eventDate = eventDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
        this.eventPoster = eventPoster;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public File getEventPoster() {
        return eventPoster;
    }

    public void setEventPoster(File eventPoster) {
        this.eventPoster = eventPoster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Events that = (Events) o;
        return eventName == that.eventName &&
                Objects.equals(eventName, that.eventName) &&
                Objects.equals(eventLocation, that.eventLocation) &&
                Objects.equals(eventDescription, that.eventDescription) &&
                Objects.equals(eventDate, that.eventDate) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(price, that.price) &&
                Objects.equals(eventPoster,that.price) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName,eventLocation,eventDescription,eventDate,startTime,endTime,price,eventPoster,id);
    }
}

