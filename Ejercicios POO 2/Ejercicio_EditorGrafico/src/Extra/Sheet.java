package Extra;

import java.util.LinkedList;

/**
 *
 * @author Ignacio Brenes
 */

public class Sheet {
    
    private int width;
    private int height;
    
    private LinkedList<Representable> objects;
    
    @SuppressWarnings("Convert2Diamond")
    
    public Sheet(int width, int height){
        
        this.width = width;
        this.height = height;
        
        this.objects = new LinkedList<Representable>();
    }
    
    public void add_Obj(Representable o){
        this.objects.add(o);
    }
    
    public String print_Sheets(){
        
        final StringBuffer sb = new StringBuffer("Lista de Objetos \n");
        
        for (Representable o : this.objects){
            
            sb.append(o.toString()).append("\n");
        }
        
        return sb.toString();
    }
    
    @Override
    
    public String toString(){
        final StringBuffer sb = new StringBuffer("Hoja ");
        
        sb.append("Tamaño del ancho = ").append(width);
        sb.append("Tamaño del alto = ").append(height);
        sb.append(", Numero de objetos = ");
        sb.append(print_Sheets());
        
        return sb.toString();
    }
    
}
