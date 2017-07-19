package cakecatalogue;

/**
 *
 * @author katie
 */
public class CakeIngredients extends Ingredients {
    
    private Shape shape;
    
    
    public CakeIngredients(Flavour flavour,Filling filling,Icings icings,Shape shape){
        super(flavour, filling, icings);
        this.shape = shape;
    }
    
    public Shape getShape(){
        return shape;
    }
    
    public boolean compare(Ingredients otherIngre) {
        
        if(!super.compare(otherIngre)) {
            return false;
        }
        
        if(!(otherIngre instanceof CakeIngredients)) {
            return false;
        }
        
        CakeIngredients ingre = (CakeIngredients)otherIngre;
        
        if (shape != ingre.getShape()) {
            return false;
        }
        
        return true;
    }
}
