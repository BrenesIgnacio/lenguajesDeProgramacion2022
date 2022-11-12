package Extra;

/**
 *
 * @author Ignacio Brenes
 */

public class Square extends Geometric{
    
   private int side;

    public Square(int objectId, int side) {
        
        super(objectId);
        
        this.side = side;
    }

    public int get_Area(){
        return this.side * this.side;
    }

    @Override
    public String toString() {
        
        final StringBuffer sb = new StringBuffer("Cuadrado ");
        
        sb.append("Tamaño del lado = ").append(side);

        return sb.toString();
    }    
}
