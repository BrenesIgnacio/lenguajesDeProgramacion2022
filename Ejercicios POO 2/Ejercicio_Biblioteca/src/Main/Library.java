package Main;

import java.util.LinkedList;

/**
 *
 * @author Ignacio Brenes
 */

public class Library {
    
    private LinkedList<Book> bookList;
    private LinkedList<Member> memberList;
    private LinkedList<Loan> loanList;

    public Library() {
        
        this.bookList = new LinkedList<>();
        this.memberList = new LinkedList<>();
        this.loanList = new LinkedList<>();
  
    }
    
    public void add_Member(Member s){
        this.memberList.add(s);
    }

    public void add_Book(Book l){
        this.bookList.add(l);
    }

    public void give_Loan(Loan p){
        
        for (Book l : this.bookList){
            
            if (l.is_Available() && l.get_Code() == p.get_Code()){
                
                l.set_Available(false);              
                l.set_Location("En prestamo actualmente al socio: "+String.valueOf(p.get_memberId())+"\n");
                
                this.loanList.add(p);
                
                System.out.println("El prestamo ha sido exitoso. \n");
                break;
            }
            
            else if (l.is_Available()==false && l.get_Code() == p.get_Code()){
                
                System.out.println("No se encuantra el libro. \n");
            }
        }
        
        for (Member s : this.memberList){
            
            if (s.get_memberId() == p.get_memberId()){
                
                int c = s.get_loans();
                s.set_loans(c+=1);
                break;
            }
        }
    }

    public void printBooks(){
        for (Book l : this.bookList){
            l.print();
        }
    }

    public void printMembers(){
        for (Member s : this.memberList){
            s.print();
        }
    }

    //We validate if a member currently has 2 or more books.
    public void twoOrMore(){
        this.memberList
                .stream()
                .filter(s -> s.get_loans() > 2)
                .forEach(Member::print);
    }
}