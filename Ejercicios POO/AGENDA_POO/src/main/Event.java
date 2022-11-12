package main;

/**
 *
 * @author Ignacio Brenes
 */
public class Event {
    
    private int audience;
    private String name;
    private String date;
    private String location;

    public Event(
            int audience, String name, String date, String location
    ) {
        
        this.audience = audience;
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public int get_audience() {
        return audience;
    }

    public void set_audience(int audience) {
        this.audience = audience;
    }

    public String get_Name() {
        return name;
    }

    public void set_Nombre(String name) {
        this.name = name;
    }

    public String get_Date() {
        return date;
    }

    public void set_Date(String date) {
        this.date = date;
    }

    public String get_Location() {
        return location;
    }

    public void set_Location(String location) {
        this.location = location;
    }
    
    public String get_ExtraA() {
        return "";
    }
}
