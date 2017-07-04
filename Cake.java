package cakecatalogue;

/**
 *
 * @author katie
 */
public class Cake {

    private String flavour, filling, shape, icings;
    private float price;
    private int size;

    public Cake(String flavour, String filling, String shape, String icings, float price, int size ) {
        this.flavour = flavour;
        this.filling = filling;
        this.shape = shape;
        this.price = price;
        this.size = size;
        this.icings = icings;
    }


    public String getFlavour(){
        return flavour;
    }
    
    public String getFilling(){
        return filling;
    }
    public String getShape(){
        return shape;
    }
    public void setShape(String shape){
        this.shape = shape;
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

    public String getIcings(){
        return icings;
    }
    
    public void setFlavour(String flavour){
        this.flavour = flavour;
    }
    public void setFilling(String filling){
        this.filling = filling;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setIcings (String icings){
        this.icings = icings;
    }
    
   public String toString(){ 
           return "Flavour: " + this.flavour +  "Filling: " + this.filling 
            + "Shape: " + this.shape + "Price: " + this.price + "Size: " + this.size +
                    "Icing: " + this.icings;
   }
}

