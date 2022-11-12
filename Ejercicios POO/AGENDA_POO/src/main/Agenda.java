package main;

import java.util.ArrayList;

/**
 *
 * @author Ignacio Brenes
 */
public class Agenda {

    public ArrayList<Contact> agenda = new ArrayList<>(); 
    public ArrayList<Event> agendEvent = new ArrayList<>(); 
   
    public void insert_Contact(Contact_Type1 contact) {
        agenda.add(contact);
    }

    public void insert_Contact(Contact_Type2 contact) {
        agenda.add(contact);
    }
    
    public void insert_Event(Event_Type1 event) {
        agendEvent.add(event);
    }
    
    public void insert_Event(Event_Type2 event) {
        agendEvent.add(event);
    }

    public void delete_Contact(String name) {

        for (Contact contact : this.agenda) {
            if (contact.get_Person().get_Name().equals(name)) {
                this.agenda.remove(contact);
            }
        }
    }

    public void print_Contact(String name) {
        for (Contact contact : this.agenda) {
            if (contact.get_Person().get_Name().equals(name)) {
                System.out.println(contact.toString());
                break;
            }
        }
    }

    public Contact get_Contact(String name) {
        for (Contact contact : this.agenda) {
            if (contact.get_Person().get_Name().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public Event get_Event(String name) {
        for (Event event : this.agendEvent) {
            if (event.get_Name().equals(name)) {
                return event;
            }
        }
        return null;
    }    
    
    


}
