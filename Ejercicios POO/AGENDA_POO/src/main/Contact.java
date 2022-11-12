package main;

/**
 *
 * @author Ignacio Brenes
 */
public class Contact {

    private int phone;

    Person person;

    public Contact(
            int person, String name, String surname1, String surname2, char gender, int age, String id
    ) {
        
        this.phone = phone;
        
        this.person = new Person(
                name, surname1, surname2, gender, age, id
        );
        
    }

    public int get_Phone() {
        return phone;
    }

    public void set_Phone(int phone) {
        this.phone = phone;
    }

    public Person get_Person() {
        return person;
    }

    public void set_Person(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "telefono: " + phone + ", " + person;
    }
    
    public String get_ExtraA() {
        return "";
    }   
}
