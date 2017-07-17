package cakecatalogue;

/**
 *
 * @author katie
 */
public abstract class BakedGoods {
    
    //Parent class for cakes and cupcakes
    
    private double price;
    private Ingredents ingre;
    
    public BakedGoods(double price, Ingredents ingre){
        this.price = price;
        this.ingre = ingre;
    }
    
    public double getPrice() {
        return price;
    }
    public void setPrice(float newPrice){
        this.price = newPrice;
    }
    
    public Ingredents getcakeSpec(){
        return ingre;
    }
}
