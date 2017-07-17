package cakecatalogue;

/**
 *
 * @author katie
 */
public enum Flavour {
    
    Carrot , Chocolate, Vanilla, redVelvet, italianSponge;
    
    public String toString(){
        switch(this) {
            case Carrot : return "Carrot";
            case Chocolate : return "Chocolate";
            case Vanilla : return "Vanilla";
            case redVelvet : return "Red Velvet";
            case italianSponge : return "Italian Sponge";
            default : return "unknown";
        }
    }
}
