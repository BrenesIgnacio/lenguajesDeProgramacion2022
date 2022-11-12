package Main;

/**
 *
 * @author Ignacio Brenes
 */

public class Main {
    
    public static void main(String[] args) {
        
        Library b = new Library();

        System.out.println("--------Sistema de libreria--------\n");
        
        //books
        b.add_Book(new Book(1, "Libro 1", "autor 1", "estanteria 1"));
        b.add_Book(new Book(2, "Libro 2", "autor 2", "estanteria 2"));
        b.add_Book(new Book(3, "Libro 3", "autor 3", "estanteria 3"));
        b.add_Book(new Book(4, "Libro 4", "autor 4", "estanteria 4"));
        b.add_Book(new Book(5, "Libro 5", "autor 5", "estanteria 5"));

        //members
        b.add_Member(new Member(1, "Socio 1", "Direccion 1"));
        b.add_Member(new Member(2, "Socio 2", "Direccion 2"));
        b.add_Member(new Member(3, "Socio 3", "Direccion 3"));
        b.add_Member(new Member(4, "Socio 4", "Direccion 4"));
        b.add_Member(new Member(5, "Socio 5", "Direccion 5"));
        
        //loans
        b.give_Loan(new Loan("02/12/2001", 1, 1));
        b.give_Loan(new Loan("02/12/2001", 2, 2));
        b.give_Loan(new Loan("02/12/2001", 3, 3));
        b.give_Loan(new Loan("02/12/2001", 4, 3));
        b.give_Loan(new Loan("02/12/2001", 5, 5));

        //available books
        b.printBooks();

        //active members
        b.printMembers();

        //Members with 2 or more books
        b.twoOrMore();        
    }
}    
