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
public class Bor extends Alkoholosital{
    private String szoloFajta;
    private String termoTerulet;

    public Bor(String iz, double alkoholTartalom,String szoloFajta, String termoTerulet) {
        super(iz,alkoholTartalom);
        this.szoloFajta = szoloFajta;
        this.termoTerulet = termoTerulet;
    }
    public String milyenSzolobolKeszult(){
        return szoloFajta;
    }
    @Override
    public String mibolKeszult()
    {
        return szoloFajta;
    }
    public String holTermelt()
    {
        return termoTerulet;
    }

    @Override
    public String toString() {
        return "Bor{" + "szoloFajta=" + szoloFajta + ", termoTerulet=" + termoTerulet + '}';
    }

    @Override
    String milyenIzu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
    
}
