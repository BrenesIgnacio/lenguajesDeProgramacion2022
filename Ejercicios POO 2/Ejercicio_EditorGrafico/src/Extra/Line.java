package Extra;

/**
 *
 * @author Ignacio Brenes
 */

public class Line extends Geometric{
 
        private int lineSize;

    public Line(int objectId, int lineSize) {
        
        super(objectId);
        
        this.lineSize = lineSize;
    }

    @Override
    public String toString() {
        
        final StringBuffer sb = new StringBuffer(" Linea ");
        
        sb.append(" lineSize = ").append(lineSize);
        
        return sb.toString();
    }    
}
