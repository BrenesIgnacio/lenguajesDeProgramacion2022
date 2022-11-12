package Extra;

import java.util.LinkedList;

/**
 *
 * @author Ignacio Brenes
 */

public class Doc {
    
    private String name;
    private LinkedList<Sheet> sheets;
    
    @SuppressWarnings("Convert2Diamond")
    
    public Doc(String name){
        this.name = name;
        
        this.sheets = new LinkedList<Sheet>();
    }
    
    public void add_Sheet(Sheet h){
        this.sheets.add(h);
    }
    
    public String print_Sheets(){
        
        final StringBuffer sb = new StringBuffer("Lista de Hojas \n");
        
        for (Sheet h : this.sheets){
            
            sb.append(h.toString()).append("\n");
        }
        
        return sb.toString();
    }

    @Override
    public String toString() {
        
        final StringBuffer sb = new StringBuffer("Doc");
        
        sb.append("Nombre del documento =").append(name);
        sb.append(", Numero de hojas =");
        sb.append(print_Sheets());
        
        return sb.toString();
    }    
}
