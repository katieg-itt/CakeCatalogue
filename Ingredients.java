package cakecatalogue;

/**
 *
 * @author katie
 */
public class Ingredients {
    
    //Change to abstract class, move unique atributes to cakeingredients.java and cupcakeingredients.java
    
    private Flavour flavour;
    private Filling filling;
    private Icings icings;
    private Shape shape;
    private int size;
    
    
    public Ingredients(Flavour flavour,Filling filling,Icings icings,Shape shape, int size){
        this.flavour = flavour;
        this.filling = filling;
        this.icings = icings;
        this.shape = shape;
        this.size = size;
    }
    
    public Flavour getFlavour(){
        return flavour;
    }
    
    public Filling getFilling(){
        return filling;
    }
    
    public Icings getIcings(){
        return icings;
    }
    
    public Shape getShape(){
        return shape;
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean compare(Ingredients otherIngre) {
        if (filling != otherIngre.getFilling()) {
            return false;
        }
        if ((flavour != null) && !flavour.equals(otherIngre.getFlavour())){
            return false;
        }
        if (icings != otherIngre.getIcings()) {
            return false;
        }
        if (shape != otherIngre.getShape()) {
            return false;
        }
        
        if (size != otherIngre.getSize()) {
            return false;
        }
        return true;
    }
}
