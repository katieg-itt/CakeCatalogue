package cakecatalogue;


import java.util.Iterator;
import java.util.List;

/**
 *
 * @author katie
 */
public class CakeCatalogue {
    
    public static void main(String[] args) {
    
        CakeInventory cakeInventory = new CakeInventory();
        addCakeInventory(cakeInventory);
        
        Ingredients customerRequest = new Ingredients (Flavour.Vanilla, Filling.vanillaCream,
                                                Icings.butterCream, Shape.Round, 9);
        List compareCakes = cakeInventory.searchCake(customerRequest);
        if (!compareCakes.isEmpty()){
            System.out.println("These cakes are avalible:");
            for (Iterator i = compareCakes.iterator(); i.hasNext();) {
                Cake cake = (Cake)i.next();
                Ingredients ingre = cake.getLists();
                System.out.println("In store we have avalible a " + ingre.getShape() + " " + cake.getSize()+ " inch " + 
                        ingre.getFlavour()  + " flavour cake with " + ingre.getFilling() + " icing. It is " + cake.getPrice() + " euro" );
            }
        } else {
            System.out.println("The selection of cakes you have requested are unavalible.");
        }
    }
    
    private static void addCakeInventory (CakeInventory cakeInventory){
        cakeInventory.addCake(Flavour.Vanilla,Filling.chocolateFudge,Shape.Round, Icings.butterCream, 9, 10);
        cakeInventory.addCake(Flavour.Chocolate,Filling.vanillaCream,Shape.Square,Icings.chocolateFudge, 12, 16);
        cakeInventory.addCake(Flavour.Carrot,Filling.creamCheese,Shape.Heart,Icings.butterCream, 5, 6);
        cakeInventory.addCake(Flavour.Vanilla,Filling.vanillaCream,Shape.Round,Icings.butterCream, 9, 9);
        cakeInventory.addCake(Flavour.Chocolate,Filling.chocolateFudge,Shape.Heart,Icings.chocolateFudge, 20, 14);
        cakeInventory.addCake(Flavour.Vanilla,Filling.vanillaCream,Shape.Square,Icings.fondant, 25, 24);
    }
}

