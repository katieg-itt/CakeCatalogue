package cakecatalogue;

/**
 *
 * @author katie
 */
public class Cake {

    Ingredents ingre;
    private float price;
    private int size;

    public Cake(Flavour flavour, Filling filling,Shape shape, Icings icings, int size, float price ) {
        this.ingre = new Ingredents(flavour,filling,icings, shape, size);
        this.price = price;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(float newPrice){
        this.price = newPrice;
    }

    public int getSize() {
        return size;
    }
    
    public void setSize(int size){
        this.size = size;
    }
    
   public Ingredents getLists(){
       return ingre;
}


}
