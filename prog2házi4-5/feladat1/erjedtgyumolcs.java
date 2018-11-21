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
public class erjedtgyumolcs extends gyumolcs implements Alkoholos{
    private double alkoholTartalom;

    public erjedtgyumolcs(double alkoholTartalom, String fajta, String iz) {
        super(fajta, iz);
        this.alkoholTartalom = alkoholTartalom;
    }
    @Override
    public double mennyiAlkoholtTartalmaz()
    {
        return alkoholTartalom;
    }

    @Override
    public String toString() {
        return "erjedtgyumolcs{" + "alkoholTartalom=" + alkoholTartalom + '}';
    }
    
    
    
}
