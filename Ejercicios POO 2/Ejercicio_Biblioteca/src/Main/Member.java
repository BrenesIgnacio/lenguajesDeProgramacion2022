package Main;

/**
 *
 * @author Ignacio Brenes
 */
public class Member {
    
    private int memberId;
    private String name;
    private String address;
    private int loans;

    public Member(         
            int memberId, String name, String address       
    ) {
        
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.loans = 0;
    }

    public int get_memberId() {
        return memberId;
    }

    public void set_loans(int loans) {
        this.loans = loans;
    }

    public int get_loans() {
        return loans;
    }

    @Override
    public String toString() {
        return "ID de socio = " + memberId +
                ", Nombre de socio = '" + name + '\'' +
                ", Dirección de socio = '" + address + '\'' +
                ", Cantidad de prestamos a nombre del socio = '" + loans + '\'';
    }

    public void print(){
        System.out.println("Socio : " + this.toString());
    }
}