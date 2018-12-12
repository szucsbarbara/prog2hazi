/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Túra;

import java.util.ArrayList;

/**
 *
 * @author szucs
 */
public class Kéktúra implements Comparable<Kéktúra>{
    private String turista_nev;
    private ArrayList<String> szakasz_eleje;
    private ArrayList<String> szakasz_vége;
    private int szakasz_hossz;

    public Kéktúra(String turista_nev) {
        this.turista_nev = turista_nev;
        this.szakasz_hossz = szakasz_hossz;
        this.szakasz_eleje=new ArrayList<String>();
        this.szakasz_vége=new ArrayList<String>();
        
        
        
    }

    public String getTurista_nev() {
        return turista_nev;
    }

    public void setTurista_nev(String turista_nev) {
        this.turista_nev = turista_nev;
    }

    public ArrayList<String> getSzakasz_eleje() {
        return szakasz_eleje;
    }

    public void setSzakasz_eleje(ArrayList<String> szakasz_eleje) {
        this.szakasz_eleje = szakasz_eleje;
    }

    public ArrayList<String> getSzakasz_vége() {
        return szakasz_vége;
    }

    public void setSzakasz_vége(ArrayList<String> szakasz_vége) {
        this.szakasz_vége = szakasz_vége;
    }

    public int getSzakasz_hossz() {
        return szakasz_hossz;
    }

    public void setSzakasz_hossz(int szakasz_hossz) {
        this.szakasz_hossz = szakasz_hossz;
    }

    @Override
    public String toString() {
        return turista_nev;
                }

    @Override
    public int compareTo(Kéktúra o) {
        return this.turista_nev.compareTo(o.getTurista_nev());
            
    }
    
    
    
    
    
    
    
    
}
