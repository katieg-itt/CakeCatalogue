package cakecatalogue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author katie
 */
public class CakeInventory {
    
    private List Cakes;
    
    public CakeInventory(){
        Cakes = new LinkedList();
        
    }
     public void addCake(CakeIngredients ingre, int size, float price){
        Cake cake = new Cake(ingre, size, price);
        Cakes.add(cake);
    }
     
    public void addCupCake(CupcakeIngredients ingre, int boxCount, float price) {
        Cupcake cupcake = new Cupcake(ingre, boxCount, price);
        Cakes.add(cupcake);
    }
     public Cake getCake(String flavour){
        for (Iterator i = Cakes.iterator(); i.hasNext();){
            Cake cake = (Cake)i.next();
            if (cake.getcakeSpec().equals(flavour)){
                return cake;
            }
        }
        return null;
    }
     
     public List searchCake(Ingredients searchIngre){
         System.out.println("Checking Cakes");
         List compareCakes = new LinkedList();
         for(Iterator i = Cakes.iterator(); i.hasNext();){
             Object next = i.next(); // put it in a temporary object
             
             if(next instanceof Cake) {
                Cake cake = (Cake)next;
                if(cake.getcakeSpec().compare(searchIngre)) {
                    compareCakes.add(cake);
                }
             } else {
                Cupcake cupcake = (Cupcake)next;
                 
                if(cupcake.getcakeSpec().compare(searchIngre)) {
                    compareCakes.add(cupcake);
                }
             }
         }
         return compareCakes;
     }
}