package main;

/**
 *
 * @author Ignacio Brenes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        
        
        Contact_Type1 contactT1 = new Contact_Type1(
                "nachobrenes@hotmail.com", 85803837, "Ignacio", "Brenes", "Mendez", 'M', 20,"208240497"
        );
        
        Contact_Type2 contactT2 = new Contact_Type2(
                "pepita", 83235081, "Maria", "Juarez", "Villalobos", 'F', 36, "900960847"
        );
        
        Event_Type1 event1 = new Event_Type1(
                "Veterinaria martinez",450, "Desfile de perritos", "12/12/22", "Pops Liberia"
        );
        
        Event_Type2 event2 = new Event_Type2(
                "Futbol",35000, "Partido Seleccion Costa Rica", "03/05/23", "Estadio Nacional"
        );
        
        
        Agenda agenda = new Agenda();
        
        agenda.insert_Contact(contactT1);
        agenda.insert_Contact(contactT2);
        
        agenda.insert_Event(event1);
        agenda.insert_Event(event2);      
        
        main.Print_GUI(agenda);
        main.Print_Event_GUI(agenda);
    }

    public void Print_GUI(Agenda agenda) {

        Print_GUI print_gui = new Print_GUI(agenda);
        
        print_gui.setVisible(true);
        print_gui.setLocationRelativeTo(null);
    }
    
    public void Print_Event_GUI(Agenda agenda) {

        Event_GUI GUI_events = new Event_GUI(agenda);
        
        GUI_events.setVisible(true);
        GUI_events.setLocationRelativeTo(null);
    }

}
