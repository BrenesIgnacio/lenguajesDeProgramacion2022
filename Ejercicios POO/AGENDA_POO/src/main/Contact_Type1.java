package main;

/**
 *
 * @author Ignacio Brenes
 */
public class Contact_Type1 extends Contact {

    private String mail;

    public Contact_Type1(
            String mail, int phone, String name, String surname1, String surname2, char gender, int age, String id
    ) {
        
        super(
                phone, name, surname1, surname2, gender, age, id
        );
        
        this.mail = mail;
    }

    @Override
    public String toString() {
        return super.toString() + "Correo: " + mail;
    }

    public String get_Mail() {
        return mail;
    }

    public void set_Mail(String mail) {
        this.mail = mail;
    }

    public Person get_Person() {
        return person;
    }

    public void set_Person(Person person) {
        this.person = person;
    }
    
    @Override
    public String get_ExtraA() {
        return this.mail;
    }
}
