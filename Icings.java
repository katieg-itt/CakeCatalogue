package cakecatalogue;

/**
 *
 * @author katie
 */
public enum Icings {
    
    butterCream, chocolateFudge, fondant,chocolateMoose,whippedCream;
    
    public String toString() {
        switch (this) {
            case butterCream : return "Butter Cream";
            case chocolateFudge : return "Chocolate Fudge";
            case fondant : return "Fondant";
            case chocolateMoose : return "Chocolate Moose";
            case whippedCream : return "Whipped Cream";
            default : return "unknown";
        }
    }
}
