package cakecatalogue;

/**
 *
 * @author katie
 */
public class Cupcake extends BakedGoods{
    private int boxCount;
    
    //inherits from baked goods

    public Cupcake(Ingredients ingre, int perBox, double price) {
        super(ingre, price);
        boxCount = perBox;
    }
    
    public int getBoxCount() {
        return boxCount;
    }
}
