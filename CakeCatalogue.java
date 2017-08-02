package cakecatalogue;


import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author katie
 */
public class CakeCatalogue {
    
    public static void main(String[] args) {
    
        CakeInventory cakeInventory = new CakeInventory();
        addCakeInventory(cakeInventory);
        
        Map details = new HashMap();
        details.put("flavour", Flavour.Chocolate);
        details.put("type", BakedGoodsType.cake);
        BakedGoodsDetails customerRequest = new BakedGoodsDetails(details);
        
        List compareCakes = cakeInventory.searchCake(customerRequest);
        
        if (!compareCakes.isEmpty()){
            System.out.println("These cakes are avalible:");
            for (Iterator i = compareCakes.iterator(); i.hasNext();) {
                BakedGoods baked = (BakedGoods)i.next();
                BakedGoodsDetails cakeDetails = baked.getDetails();
                
                System.out.println("We have a "+cakeDetails.getDetail("type")+" with the following properties");
                
                for(Iterator j = cakeDetails.getDetails().keySet().iterator(); j.hasNext(); ) {
                    String name = (String)j.next();
                    if(name.equals("type")) {
                        continue; // Skip this detail
                    }
                    System.out.println("    "+name+": "+cakeDetails.getDetail(name));
                }
                System.out.println("-------------------------------");
            }
        } else {
            System.out.println("The selection of cakes you have requested are unavalible.");
        }
    }
    
    private static void addCakeInventory (CakeInventory cakeInventory){
        Map details;
        
        details = new HashMap();
        details.put("type", BakedGoodsType.cake);
        details.put("flavour", Flavour.Vanilla);
        details.put("filling", Filling.chocolateFudge);
        details.put("icing", Icings.butterCream);
        details.put("cakeShape", Shape.Round);
        details.put("cakeSize", 9);
        cakeInventory.addBakedGood(new BakedGoodsDetails(details), 5);
        
        details = new HashMap();
        details.put("type", BakedGoodsType.cake);
        details.put("flavour", Flavour.Chocolate);
        details.put("filling", Filling.vanillaCream);
        details.put("icing", Icings.chocolateFudge);
        details.put("cakeShape", Shape.Heart);
        details.put("cakeSize", 11);
        cakeInventory.addBakedGood(new BakedGoodsDetails(details), 15);
        
        details = new HashMap();
        details.put("type", BakedGoodsType.cupCake);
        details.put("flavour", Flavour.Vanilla);
        details.put("filling", Filling.vanillaCream);
        details.put("icing", Icings.butterCream);
        details.put("cupCakeSize", CupcakeSize.small);
        details.put("perBox", 4);
        cakeInventory.addBakedGood(new BakedGoodsDetails(details), 5);
        
        details = new HashMap();
        details.put("type", BakedGoodsType.cupCake);
        details.put("flavour", Flavour.Chocolate);
        details.put("filling", Filling.oreoCream);
        details.put("cupCakeSize", CupcakeSize.medium);
        details.put("perBox", 4);
        cakeInventory.addBakedGood(new BakedGoodsDetails(details), 7);
        
        details = new HashMap();
        details.put("type", BakedGoodsType.cookie);
        details.put("flavour", Flavour.Chocolate);
        details.put("perBag", 6);
        cakeInventory.addBakedGood(new BakedGoodsDetails(details), 2);
        
        details = new HashMap();
        details.put("type", BakedGoodsType.cookie);
        details.put("flavour", Flavour.ChocolateChip);
        details.put("perBag", 6);
        cakeInventory.addBakedGood(new BakedGoodsDetails(details), 2);
        
        
    }
}

