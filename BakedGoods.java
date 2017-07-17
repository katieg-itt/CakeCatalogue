package cakecatalogue;

/**
 *
 * @author katie
 */
public abstract class BakedGoods {
    
    //Parent class for cakes and cupcakes
    
    private double price;
    private Ingredients ingre;
    
    public BakedGoods(double price, Ingredients ingre){
        this.price = price;
        this.ingre = ingre;
    }
    
    public double getPrice() {
        return price;
    }
    public void setPrice(float newPrice){
        this.price = newPrice;
    }
    
    public Ingredients getcakeSpec(){
        return ingre;
    }
}
