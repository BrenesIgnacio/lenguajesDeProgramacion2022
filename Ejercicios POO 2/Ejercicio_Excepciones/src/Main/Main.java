package Main;

import java.util.*;

/**
 *
 * @author Ignacio Brenes
 */

public class Main {
    
    public static void main(String[] args){

        //Creating the scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println(
                "Operacion a resolver"
        );
        
        String operation = sc.nextLine();

        Evaluator e = new Evaluator();
        List expression = e.enlist(operation);
        
        System.out.println(
                "Este es el resultado de la operacion realizada: "+e.result(expression).get_Num()
        );
    }
}

    
