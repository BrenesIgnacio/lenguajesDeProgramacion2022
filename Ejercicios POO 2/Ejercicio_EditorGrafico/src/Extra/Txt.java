package Extra;

/**
 *
 * @author Ignacio Brenes
 */

public class Txt extends Representable{
    
    private String txt;
    
    public Txt(int objectId, String txt){
        super(objectId);
        this.txt = txt;
    }
    
    @Override
    public String toString(){
        
        final StringBuffer sb = new StringBuffer("Txt ");
        
        sb.append("txt = ").append(txt);
        
        return sb.toString();
    }
    
}
