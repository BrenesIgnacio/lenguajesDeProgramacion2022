package Main;

/**
 *
 * @author Ignacio Brenes
 */

public class Book {
    
    private int code;
    private String title;
    private String author;
    private boolean available;
    private String location;

    public Book(         
            int code, String title, String author, String location           
    ) {
            
        this.code = code;
        this.title = title;
        this.author = author;
        this.available = true;
        this.location = location;
    
}
    
    public int get_Code() {
        return code;
    }

    public boolean is_Available() {
        return available;
    }

    public void set_Available(boolean disponible) {
        this.available = disponible;
    }

    public void set_Location(String localizacion) {
        this.location = localizacion;
    }

    @Override
    
    public String toString() {
        return
                "Codigo del libro = " + code +
                ", título del libro = '" + title + '\'' +
                ", autor del libro= '" + author + '\'' +
                ", El libro esta disponible? = '" + available + '\'' +
                ", Ubicacion = '" + location + '\'';
    }

    public void print(){
        
        System.out.println(
                "Libro : " + this.toString()
        );
    }
}