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
        
        Ingredients customerRequest = new CakeIngredients (Flavour.Vanilla, Filling.vanillaCream,
                                                Icings.butterCream, Shape.Round);
        List compareCakes = cakeInventory.searchCake(customerRequest);
        if (!compareCakes.isEmpty()){
            System.out.println("These cakes are avalible:");
            for (Iterator i = compareCakes.iterator(); i.hasNext();) {
                BakedGoods baked = (BakedGoods)i.next();
                
                if(baked instanceof Cake) {
                    Cake cake = (Cake)baked;
                    CakeIngredients ingre = (CakeIngredients)cake.getcakeSpec();
                    System.out.println("In store we have avalible a " + ingre.getShape() + " " + cake.getSize()+ " inch " + 
                            ingre.getFlavour()  + " flavour cake with " + ingre.getFilling() + " icing. It is " + cake.getPrice() + " euro" );
                } else if( baked instanceof Cupcake) {
                    Cupcake cupcake = (Cupcake)baked;
                    CupcakeIngredients CupcakeIngre = (CupcakeIngredients)cupcake.getcakeSpec();
                    System.out.println("In store we have avalible " + cupcake.getBoxCount() + " " + CupcakeIngre.getFlavour() + "Flavour cupcake with "
                    + CupcakeIngre.getFilling() + "filling and " + CupcakeIngre.getIcings() + "icing. The price is " + cupcake.getPrice() + " euro" );
                }
            }
        } else {
            System.out.println("The selection of cakes you have requested are unavalible.");
        }
    }
    
    private static void addCakeInventory (CakeInventory cakeInventory){
        cakeInventory.addCake(new CakeIngredients(Flavour.Vanilla,  Filling.chocolateFudge, Icings.butterCream,     Shape.Round),    9,     10);
        cakeInventory.addCake(new CakeIngredients(Flavour.Chocolate,Filling.vanillaCream,   Icings.chocolateFudge,  Shape.Square),   12,    16);
        cakeInventory.addCake(new CakeIngredients(Flavour.italianSponge,   Filling.creamCheese,    Icings.whippedCream,     Shape.Heart),    5,     6);
        cakeInventory.addCake(new CakeIngredients(Flavour.Vanilla,  Filling.vanillaCream,   Icings.butterCream,     Shape.Round),    9,     9);
        cakeInventory.addCake(new CakeIngredients(Flavour.Chocolate,Filling.chocolateFudge, Icings.chocolateFudge,  Shape.Heart),    20,    14);
        cakeInventory.addCake(new CakeIngredients(Flavour.Vanilla,  Filling.oreoCream,   Icings.fondant,         Shape.Square),   25,    24);
        cakeInventory.addCake(new CakeIngredients(Flavour.Vanilla,  Filling.chocolateFudge, Icings.butterCream,     Shape.Round),    9,     10);
        cakeInventory.addCake(new CakeIngredients(Flavour.italianSponge,  Filling.vanillaCream,   Icings.whippedCream,     Shape.Round),    9,     10);
        cakeInventory.addCake(new CakeIngredients(Flavour.Vanilla,  Filling.vanillaCream,   Icings.fondant,         Shape.Square),   25,    20);
        
        cakeInventory.addCupCake(new CupcakeIngredients(Flavour.Vanilla,   Filling.vanillaCream,   Icings.butterCream,     CupcakeSize.small),  4, 5);
        cakeInventory.addCupCake(new CupcakeIngredients(Flavour.Chocolate, Filling.chocolateFudge, Icings.chocolateFudge,  CupcakeSize.large),  2, 24);
        cakeInventory.addCupCake(new CupcakeIngredients(Flavour.Vanilla,   Filling.chocolateFudge, Icings.butterCream,     CupcakeSize.medium), 6, 10);
        cakeInventory.addCupCake(new CupcakeIngredients(Flavour.Vanilla,    Filling.oreoCream,    Icings.whippedCream,     CupcakeSize.small),  6, 5);
        cakeInventory.addCupCake(new CupcakeIngredients(Flavour.italianSponge,   Filling.vanillaCream,   Icings.butterCream,     CupcakeSize.medium), 4, 10);
        cakeInventory.addCupCake(new CupcakeIngredients(Flavour.Carrot,    Filling.creamCheese,    Icings.butterCream,     CupcakeSize.large),  1, 24);
        cakeInventory.addCupCake(new CupcakeIngredients(Flavour.italianSponge,   Filling.lemonCream,   Icings.whippedCream,     CupcakeSize.medium), 4, 10);
        cakeInventory.addCupCake(new CupcakeIngredients(Flavour.Carrot,    Filling.creamCheese,    Icings.butterCream,     CupcakeSize.small),  6, 5);
        cakeInventory.addCupCake(new CupcakeIngredients(Flavour.redVelvet,    Filling.lemonCream,    Icings.fondant,     CupcakeSize.large),  1, 10);
    }
}

