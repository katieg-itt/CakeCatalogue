package cakecatalogue;

/**
 *
 * @author katie
 */
public class BakedGoods {
    
    //Parent class for cakes and cupcakes
    
    private double price;
    private BakedGoodsType type;
    private Ingredients ingre;
    
    
    public BakedGoods(BakedGoodsType type, Ingredients ingre,double price){
        this.price = price;
        this.ingre = ingre;
        this.type = type;
    }
    
    public double getPrice() {
        return price;
    }
    
    public BakedGoodsType getType() {
        return type;
    }
    
    public Ingredients getcakeSpec(){
        return ingre;
    }
}
