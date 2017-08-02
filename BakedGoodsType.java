package cakecatalogue;

/**
 *
 * @author katie
 */
public enum BakedGoodsType {

    cake,cupCake,cookie,tart;
    
    public String toString(){
        switch(this) {
            case cake : return "Cake";
            case cupCake : return "CupCake";
            case cookie : return "Cookie";
            case tart : return "Tart";
            default : return "unknown";
        }
    }
}
