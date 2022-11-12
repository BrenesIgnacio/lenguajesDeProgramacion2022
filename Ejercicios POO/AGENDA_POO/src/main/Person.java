package main;

/**
 *
 * @author Ignacio Brenes
 */
public class Person {
    
    private String name;
    private String surname1;
    private String surname2;
    private String id;
    private char gender;
    private int age;

    public Person(
            String name, String surname1, String surname2, char gender, int age, String id
    ) {
        
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.gender = gender;
        this.age = age;
        this.id = id;
    }

    public Person() {
    }
    
    public String get_Name() {
        return name;
    }

    public void set_Name(String name) {
        this.name = name;
    }

    public String get_surname1() {
        return surname1;
    }

    public void set_surname1(String surname1) {
        this.surname1 = surname1;
    }

    public String get_surname2() {
        return surname2;
    }

    public void set_surname2(String surname2) {
        this.surname2 = surname2;
    }

    public char get_Gender() {
        return gender;
    }

    public void setSexo(char gender) {
        this.gender = gender;
    }

    public int get_Age() {
        return age;
    }

    public void set_Age(int age) {
        this.age = age;
    }

    public String get_Id() {
        return id;
    }

    public void set_Cedula(String id) {
        this.id = id;
    }
    
    
    @Override
    public String toString() {
        return "nombre: " + name + ", primer pellido: " + surname1 
                + ", segundo apellido: " + surname2 + ", cedula: " + id 
                + ", sexo: " + gender + ", edad: " + age;
    }
    
    
    
}
