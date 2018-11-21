/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

/**
 *
 * @author szucs
 */
public class Szeszesital extends Ital{
    private double AlkoholTartalom;

    public Szeszesital(String név, String kiszerelés, int ár,double AlkoholTartalom) {
        super(név,kiszerelés,ár);
        this.AlkoholTartalom = AlkoholTartalom;
    }

    public double getAlkoholTartalom() {
        return AlkoholTartalom;
    }

    @Override
    public String toString() {
        return AlkoholTartalom+"% alkoholtartalmú"+super.toString();
    }

    
    
  
}
