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
     public void addCake(
                            Flavour flavour, 
                            Filling filling, 
                            Shape shape, 
                            Icings icings, 
                            int size,
                            float price){

        Cake cake = new Cake(flavour, filling, shape, icings, size, price);
        Cakes.add(cake);
    }
     public Cake getCake(String flavour){
        for (Iterator i = Cakes.iterator(); i.hasNext();){
            Cake cake = (Cake)i.next();
            if (cake.getLists().equals(flavour)){
                return cake;
            }
        }
        return null;
    }
     
     public List searchCake(Ingredents seachIngre){
         System.out.println("Checking Cakes");
         List compareCakes = new LinkedList();
         for(Iterator i = Cakes.iterator(); i.hasNext();){
             Cake cake = (Cake)i.next();
             if(cake.getLists().compare(seachIngre)) {
                 compareCakes.add(cake);
             }
         }
         return compareCakes;
     }
}