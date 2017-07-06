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
