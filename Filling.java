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
public enum Filling {
    
    chocolateFudge, vanillaCream, creamCheese, chocolateGanache;
    
    public String toString(){
        switch(this) {
            case chocolateFudge : return "Chocolate Fudge";
            case vanillaCream : return "Vanilla Cream";
            case creamCheese : return "Cream Cheese";
            case chocolateGanache : return "Chocolate Ganache";
            default : return "unknown";
        }
    }
    
}
