package cakecatalogue;

/**
 *
 * @author katie
 */
public enum Shape {
    
    Round, Square, Heart;
    
    public String toString(){
        switch (this){
            case Round : return "Round";
            case Square : return "Square";
            case Heart : return "Heart";
            default : return "unkown";
        }
    }
}
