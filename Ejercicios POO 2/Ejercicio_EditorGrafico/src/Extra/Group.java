package Extra;

import java.util.LinkedList;

/**
 *
 * @author Ignacio Brenes
 */

public class Group extends Representable{
    
    private LinkedList<Representable> objects;

    @SuppressWarnings("Convert2Diamond")
    
    public Group(int objectId) {
        
        super(objectId);
        
        this.objects = new LinkedList<Representable>();
    }

    public void add_Obj(Representable o){
        this.objects.add(o);
    }

    public String print_Objects(){
        final StringBuffer sb = new StringBuffer("Lista de Objetos \n ");
        
        for (Representable o : this.objects){
            
            sb.append(o.toString()).append("\n");
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        
        final StringBuffer sb = new StringBuffer("Nombre de Grupo");
        
        sb.append(print_Objects());
        
        return sb.toString();
    }  
}
