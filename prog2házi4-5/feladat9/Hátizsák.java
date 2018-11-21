/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat9;

/**
 *
 * @author szucs
 */
public class Hátizsák implements Comparable<Hátizsák>{
    private String Márka;
    private double űrtartalom;
    private int zsebekSzáma;
    private boolean vízhatlan;

    public Hátizsák(String Márka, double űrtartalom, int zsebekSzáma, boolean vízhatlan) {
        this.Márka = Márka;
        this.űrtartalom = űrtartalom;
        this.zsebekSzáma = zsebekSzáma;
        this.vízhatlan = vízhatlan;
    }

    public String getMárka() {
        return Márka;
    }

    public double getŰrtartalom() {
        return űrtartalom;
    }

    public int getZsebekSzáma() {
        return zsebekSzáma;
    }

    public boolean isVízhatlan() {
        return vízhatlan;
    }

    @Override
    public String toString() {
        return "H\u00e1tizs\u00e1k{" + "M\u00e1rka=" + Márka + ", \u0171rtartalom=" + űrtartalom + ", zsebekSz\u00e1ma=" + zsebekSzáma + ", v\u00edzhatlan=" + vízhatlan + '}';
    }
    
    public int compareTo(Hátizsák t)
    {
        
        

        if(this.Márka.compareTo(t.Márka)==0)
            return (int)(this.zsebekSzáma-t.zsebekSzáma);
        else
           return (this.Márka.compareTo(t.Márka));
}
        
    }

