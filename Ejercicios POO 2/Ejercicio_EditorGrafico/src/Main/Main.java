package Main;

import Extra.*;

/**
 *
 * @author Ignacio Brenes
 */

public class Main {
    
     public static void main(String[] args) {
         
        //Adding the Doc
        Doc doc = new Doc("Doc1");
        
        //Adding the Sheet
        Sheet h1 = new Sheet(50,80);

        //Adding the Txt
        h1.add_Obj(new Txt(01,"Txt 1"));
        
        //Adding the Square
        h1.add_Obj(new Square(02,5));
        
        //Adding the Line
        h1.add_Obj(new Line(03,45));

        //Adding the Group
        Group g = new Group(04);
        
        //Adding antoher Txt
        g.add_Obj(new Txt(05,"Txt 2"));
        
        h1.add_Obj(g);

        //Adding the Sheet
        doc.add_Sheet(h1);

        //ToString
        System.out.println(doc.toString());
    }    
}
