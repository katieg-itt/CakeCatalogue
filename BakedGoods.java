package cakecatalogue;

/**
 *
 * @author katie
 */
public class BakedGoods {
    
    //Parent class for cakes and cupcakes
    
    private double price;
    private BakedGoodsDetails details;
    
    
    public BakedGoods(BakedGoodsDetails details, double price){
        this.price = price;
        this.details = details;
    }
    
    public double getPrice() {
        return price;
    }
    
    public BakedGoodsDetails getDetails(){
        return details;
    }
}