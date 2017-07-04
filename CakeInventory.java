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
             String flavour, 
             String filling, 
             String shape, 
             String icings, 
             float price, 
             int size ){

        Cake cake = new Cake(flavour, filling, shape, icings, price, size);
        Cakes.add(cake);
    }
     public Cake getCake(String flavour){
        for (Iterator i = Cakes.iterator(); i.hasNext();){
            Cake cake = (Cake)i.next();
            if (cake.getFlavour().equals(flavour)){
                return cake;
            }
        }
        return null;
    }
     
     public Cake searchCake(Cake searchCake){
         for (Iterator i = Cakes.iterator(); i.hasNext();){
             Cake cake = (Cake)i.next();
             String flavour = searchCake.getFlavour();
             if((flavour != null) && (!flavour.equals("")) &&
                     (!flavour.equals(cake.getFlavour())))
                 continue;
             String filling = searchCake.getFilling();
             if((filling != null) && (!filling.equals("")) &&
                     (!filling.equals(cake.getFilling())))
                 continue;
             String shape = searchCake.getShape();
             if((shape !=null) && (!shape.equals("")) &&
                     (!shape.equals(cake.getShape())))
                 continue;
             String icings = searchCake.getIcings();
             if((icings != null) && (!icings.equals("")) &&
                     (!icings.equals(cake.getIcings())))
                 continue;
             int size = searchCake.getSize();
             if((size!=0) && (size != cake.getSize()))
                 continue;
         }
         return null;
     }
}
