package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


/**
 *
 * @author Ignacio Brenes
 */

public class Evaluator {
    
    public Evaluator() {
    }

    public List enlist(String operation){
        
        List list = new ArrayList<>();
        
        StringTokenizer st = new StringTokenizer(
                operation,"+/-* ", true
        );
        
        try {
            while (st.hasMoreTokens()) {
                
                String tk = st.nextToken();
                
                if (tk.matches("[0-9]*")){
                    
                    Number n = new Number(Integer.valueOf(tk));
                    list.add(n);
                }
                
                else if(tk.matches("[+/*[-]]+")){
                    
                    Operation o = new Operation(tk);
                    list.add(o);
                }
                
                else if(tk.equals(" ")){
                }
                
                else {
                    
                    throw new Exception(
                            "carácter inválido"
                    );
                }
            }
            
       } catch (Exception e) {
           
            System.err.println(e.getMessage());
            
        }
        return list;
    }

    public int operate(
            int n1, int n2, String operator
    ){
        
        int result = 0;
        
        switch (operator){
            
            case "+":
                result = n1 + n2;
                return result;
            case "-":
                result = n1 - n2;
                return result;
            case "*":
                result = n1 * n2;
                return result;
            case "/":
                result = n1 / n2;
                return result;
        }
        return result;
    }

    public Number result(List list){
        
        Number result = new Number(-1);
        Object n1, n2, operator;
        Number num1, num2;
        Operation op;

        try {
            
            for(int i = 0; i < list.size();){
                
                if (list.size() < 3){
                    
                    throw new Exception(
                            "El orden de los elementos no es correcto"
                    );
                }
                
                n1 = list.get(i);
                operator = list.get(i+1);
                n2 = list.get(i+2);
                
                if(
                        (n1.getClass().toString().equals("class Num")
                        ) && (operator.getClass().toString().equals("class Op")
                        ) && (n2.getClass().toString().equals("class Num"))
                        ){
                    
                    num1 = (Number) n1;
                    num2 = (Number) n2;
                    op = (Operation) operator;

                    result.set_Num(operate(num1.get_Num(),num2.get_Num(),op.get_Op()));
                    
                    list.add(0, result);
                    list.subList(1, 4).clear();

                }else {
                    
                    throw new Exception(
                            "El orden de los elementos no es correcto"
                    );
                }
                
                if 
                        (list.size() == 1) {
                    
                    return result;
                }
            }

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return result;
    }    
}
