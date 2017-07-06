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
public enum Icings {
    
    butterCream, chocolateFudge, Fondant;
    
    public String toString() {
        switch (this) {
            case butterCream : return "Butter Cream";
            case chocolateFudge : return "Chocolate Fudge";
            case Fondant : return "Fondant";
            default : return "unknown";
        }
    }
}
