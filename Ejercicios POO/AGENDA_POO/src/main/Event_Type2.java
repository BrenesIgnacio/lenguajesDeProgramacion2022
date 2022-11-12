package main;

/**
 *
 * @author Ignacio Brenes
 */
public class Event_Type2 extends Event{
    
    private String theme;

    public Event_Type2(
            String theme, int audience, String name, String date, String location
    ) {
        
        super(
                audience, name, date, location
        );
        
        this.theme = theme;
    }

    public String get_theme() {
        return theme;
    }

    public void set_theme(String theme) {
        this.theme = theme;
    }
    
    @Override
    public String get_ExtraA() {
        return this.theme;
    }
    
    
    
}
