/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakecatalogue;

/**
 *
 * @author katie
 */
public enum Flavour {
    
    Carrot , Chocolate, Vanilla;
    
    public String toString(){
        switch(this) {
            case Carrot : return "Carrot";
            case Chocolate : return "Chocolate";
            case Vanilla : return "Vanilla";
            default : return "unknown";
        }
    }
}
