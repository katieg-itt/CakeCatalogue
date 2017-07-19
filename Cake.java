package cakecatalogue;

/**
 *
 * @author katie
 */
public class Cake extends BakedGoods{
    private int size;

    public Cake(Ingredients ingre, int size, float price) {
       super(ingre,price);
       this.size = size;
    }

    public int getSize() {
        return size;
    }
    
    public void setSize(int size){
        this.size = size;
    }
}

