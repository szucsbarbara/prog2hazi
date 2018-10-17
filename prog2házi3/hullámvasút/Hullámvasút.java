/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author szucs
 */
public class Hullámvasút {
    private String hullámvasút_neve;
    private String világ_neve;
    private int legkisebb_magasság;
    private int várakozási_idő;

    public Hullámvasút(String hullámvasút_neve, String világ_neve, int legkisebb_magasság, int várakozási_idő) {
        this.hullámvasút_neve = hullámvasút_neve;
        this.világ_neve = világ_neve;
        this.legkisebb_magasság = legkisebb_magasság;
        this.várakozási_idő = várakozási_idő;
    }

    public String getHullámvasút_neve() {
        return hullámvasút_neve;
    }

    public String getVilág_neve() {
        return világ_neve;
    }

    public int getLegkisebb_magasság() {
        return legkisebb_magasság;
    }

    public int getVárakozási_idő() {
        return várakozási_idő;
    }

    public void setHullámvasút_neve(String hullámvasút_neve) {
        this.hullámvasút_neve = hullámvasút_neve;
    }

    public void setVilág_neve(String világ_neve) {
        this.világ_neve = világ_neve;
    }

    public void setLegkisebb_magasság(int legkisebb_magasság) {
        this.legkisebb_magasság = legkisebb_magasság;
    }

    public void setVárakozási_idő(int várakozási_idő) {
        this.várakozási_idő = várakozási_idő;
    }

    @Override
    public String toString() {
        return "Hull\u00e1mvas\u00fat{" + "hull\u00e1mvas\u00fat_neve=" + hullámvasút_neve + ", vil\u00e1g_neve=" + világ_neve + ", legkisebb_magass\u00e1g=" + legkisebb_magasság + ", v\u00e1rakoz\u00e1si_id\u0151=" + várakozási_idő + '}';
    }
    
    
}
