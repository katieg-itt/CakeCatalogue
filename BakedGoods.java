package cakecatalogue;

/**
 *
 * @author katie
 */
public class BakedGoods {
    
    //Parent class for cakes and cupcakes
    
    private double price;
    private BakedGoodsType type;
    private BakedGoodsDetails details;
    
    
    public BakedGoods(BakedGoodsType type, BakedGoodsDetails details, double price){
        this.price = price;
        this.details = details;
        this.type = type;
    }
    
    public double getPrice() {
        return price;
    }
    
    public BakedGoodsType getType() {
        return type;
    }
    
    public BakedGoodsDetails getDetails(){
        return details;
    }
}
