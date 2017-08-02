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
    
    public void addBakedGood(BakedGoodsDetails details, float price) {
        BakedGoods item = new BakedGoods(details, price);
        Cakes.add(item);
    }
    
     
    public List searchCake(BakedGoodsDetails details){
        List compareCakes = new LinkedList();
        for(Iterator i = Cakes.iterator(); i.hasNext();){
            BakedGoods next = (BakedGoods)i.next();
            BakedGoodsDetails nextDetails = next.getDetails();
            if(nextDetails.matches(details)) {
                compareCakes.add(next);
            }
        }
        return compareCakes;
    }
}