/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fagyi;

import java.util.ArrayList;

/**
 *
 * @author szucs
 */
public class TéliFagyi {
    private String nev;
    private ArrayList<String> rendelés;

    public TéliFagyi() {
        rendelés= new ArrayList<>();
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public ArrayList<String> getRendelés() {
        return rendelés;
    }

    public void setRendelés(ArrayList<String> rendelés) {
        this.rendelés = rendelés;
    }
    
    
    
    
}
