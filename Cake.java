package cakecatalogue;

/**
 *
 * @author katie
 */
public class Cake extends BakedGoods{

    Ingredents ingre;
    private float price;
    private int size;

    public Cake(Ingredents ingre, float price) {
       super(price,ingre);
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


//Flavour flavour, Filling filling,Shape shape, Icings icings, int size
//this.ingre = new Ingredents(flavour,filling,icings, shape, size);  this.price = price; this.size = size;
        
       