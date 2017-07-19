package cakecatalogue;

/**
 *
 * @author katie
 */
public abstract class Ingredients {
    
    //Change to abstract class, move unique atributes to cakeingredients.java and cupcakeingredients.java
    
    private Flavour flavour;
    private Filling filling;
    private Icings icings;
    
    
    public Ingredients(Flavour flavour,Filling filling,Icings icings){
        this.flavour = flavour;
        this.filling = filling;
        this.icings = icings;
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
        return true;
    }
}
