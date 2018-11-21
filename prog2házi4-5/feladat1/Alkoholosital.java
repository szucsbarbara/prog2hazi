/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat1;

/**
 *
 * @author szucs
 */
public abstract class Alkoholosital extends Ital implements Alkoholos{
    private String iz; 
    private double alkoholTartalom;

    public Alkoholosital(String iz, double alkoholTartalom) {
        this.iz = iz;
        this.alkoholTartalom = alkoholTartalom;
    }
    
    @Override
    public double mennyiAlkoholtTartalmaz(){
        return alkoholTartalom;
    }
    public String milyenizu()
    {
        return iz;
    }

    @Override
    public String toString() {
        return "Alkoholosital{" + "iz=" + iz + ", alkoholTartalom=" + alkoholTartalom + '}';
    }
    

    
}
