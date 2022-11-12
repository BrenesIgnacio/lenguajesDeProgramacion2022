package main;

/**
 *
 * @author Ignacio Brenes
 */
public class Event_Type1 extends Event{
    
    private String speaker;
    
    public Event_Type1(
            String speaker, int audience, String name, String date, String location
    ) {
        
        super(
                audience, name, date, location
        );
        
        this.speaker = speaker;
    }

    public String get_Speaker_Name() {
        return speaker;
    }

    public void set_Speaker_Name(String speaker) {
        this.speaker = speaker;
    }
    
    
    @Override
    public String get_ExtraA() {
        return this.speaker;
    }   
}
