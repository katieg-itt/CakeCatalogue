package cakecatalogue;

/**
 *
 * @author katie
 */
public class CupcakeIngredients extends Ingredients {
    private CupcakeSize size;
    
    
    public CupcakeIngredients(Flavour flavour,Filling filling,Icings icings,CupcakeSize size){
        super(flavour, filling, icings);
        this.size = size;
    }
    
    public CupcakeSize getSize(){
        return size;
    }
    
    public boolean compare(Ingredients otherIngre) {
        
        if(!super.compare(otherIngre)) {
            return false;
        }
        
        if(!(otherIngre instanceof CupcakeIngredients)) {
            return false;
        }
        
        CupcakeIngredients ingre = (CupcakeIngredients)otherIngre;
        
        if (size != ingre.getSize()) {
            return false;
        }
        
        return true;
    }
}
