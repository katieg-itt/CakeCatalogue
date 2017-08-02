package cakecatalogue;

/**
 *
 * @author katie
 */
public enum Flavour {
    
    Carrot , Chocolate, Vanilla, redVelvet, italianSponge, ChocolateChip;
    
    public String toString(){
        switch(this) {
            case Carrot : return "Carrot";
            case Chocolate : return "Chocolate";
            case Vanilla : return "Vanilla";
            case redVelvet : return "Red Velvet";
            case italianSponge : return "Italian Sponge";
            case ChocolateChip : return "Chocolate Chip";
            default : return "unknown";
        }
    }
}
