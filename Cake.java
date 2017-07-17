package cakecatalogue;

/**
 *
 * @author katie
 */
public class Cake extends BakedGoods{

    Ingredients ingre;
    private float price;
    private int size;

    public Cake(Ingredients ingre, float price) {
       super(price,ingre);
    }

    public int getSize() {
        return size;
    }
    
    public void setSize(int size){
        this.size = size;
    }
    
   public Ingredients getLists(){
       return ingre;
}


}


//Flavour flavour, Filling filling,Shape shape, Icings icings, int size
//this.ingre = new Ingredients(flavour,filling,icings, shape, size);  this.price = price; this.size = size;
        
       