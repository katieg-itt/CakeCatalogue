package cakecatalogue;

/**
 *
 * @author katie
 */
public enum CupcakeSize {
    
    small, medium, large;
    
    public String toString() {
        switch (this) {
            case small : return "Small";
            case medium : return "Medium";
            case large : return "Large";
            default : return "unknown";
        }
    }
}