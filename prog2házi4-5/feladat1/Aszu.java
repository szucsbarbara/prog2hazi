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
public class Aszu extends Bor{
    private int puttonySzam;

    public Aszu(int puttonySzam, String iz, double alkoholTartalom, String szoloFajta, String termoTerulet) {
        super(iz, alkoholTartalom, szoloFajta, termoTerulet);
        this.puttonySzam = puttonySzam;
    }
    
    public int hanyPuttonyos()
    {
        return puttonySzam;
    }

    @Override
    public String toString() {
        return "Aszu{" + "puttonySzam=" + puttonySzam + '}';
    }
    
    
    
}
