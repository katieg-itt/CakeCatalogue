package cakecatalogue;

/**
 *
 * @author katie
 */
public enum Filling {
    
    chocolateFudge, vanillaCream, creamCheese, chocolateGanache,lemonCream, oreoCream, chocolateMoose;
    
    public String toString(){
        switch(this) {
            case chocolateFudge : return "Chocolate Fudge";
            case vanillaCream : return "Vanilla Cream";
            case creamCheese : return "Cream Cheese";
            case chocolateGanache : return "Chocolate Ganache";
            case lemonCream : return "lemon Cream";
            case oreoCream : return "Oreao Cream";
            case chocolateMoose : return "Cocolate Moose";
            default : return "unknown";
        }
    }
    
}
