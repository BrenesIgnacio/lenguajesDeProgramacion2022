package main;

/**
 *
 * @author Ignacio Brenes
 */
public class Contact_Type2 extends Contact{
    
    private String nickname;
    
    public Contact_Type2(          
            String nickname, int phone, String name, String surname1, String surname2, char gender, int age, String id
    ) {
        
        super(
                phone, name, surname1, surname2, gender, age, id
        );
        
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return super.toString() + "apodo: " + nickname;
    }

    public String get_Nickname() {
        return nickname;
    }

    public void set_Nickname(String nickname) {
        this.nickname = nickname;
    }

    public Person get_Person() {
        return person;
    }

    public void set_Person(Person person) {
        this.person = person;
    }
    
    @Override
    public String get_ExtraA() {
        return this.nickname;
    }
    
    
    
}
