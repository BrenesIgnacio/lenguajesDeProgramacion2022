package Main;

/**
 *
 * @author Ignacio Brenes
 */

public class Loan {
    
    private String date;
    private int code;
    private int memberId;

    public Loan(
            
            String date, int code, int memberId
            
    ) {
        
        this.date = date;
        this.code = code;
        this.memberId = memberId;
    }

    public int get_Code() {
        return code;
    }

    public int get_memberId() {
        return memberId;
    }
}
    
