package cakecatalogue;

/**
 *
 * @author katie
 */
public class CakeCatalogue {
    
    public static void main(String[] args) {
    
        CakeInventory cakeInventory = new CakeInventory();
        addCakeInventory(cakeInventory);
        Cake cakeCheck;
        cakeCheck = new Cake("vanilla", "chocolate", "Round", "cream", 9, 10);
       
        Cake cake = cakeInventory.searchCake(cakeCheck);
        if (cake !=null){
            System.out.println("This is the cake " + cake.getFlavour()
            + cake.getFlavour() + cake.getFilling() + cake.getShape() + cake.getIcings() + cake.getPrice() +
                    cake.getSize());
        }else {
         System.out.println("We do not currently have that type of cake");   
        }
    }
    
    private static void addCakeInventory (CakeInventory cakeInventory){
        cakeInventory.addCake("Vanilla", "Chocolate", "Round", "Cream", 9, 10);
        cakeInventory.addCake("Chocolate", "Vanilla", "Square", "Butter Cream", 12, 16);
        cakeInventory.addCake("Rum", "Coffee", "Round", "Coffee", 5, 6);
        cakeInventory.addCake("Chocolate", "Chocolate Fudge", "Heart", "Chocolate Fudge", 11, 12);
        cakeInventory.addCake("vanilla", "Vanilla", "Round", "Red Velvet", 20, 14);
        cakeInventory.addCake("Carrot", "Cream Cheese", "Square", "Cream  Cheese", 25, 24);
    }
}
