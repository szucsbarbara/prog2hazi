/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parkolás;

import java.util.ArrayList;

/**
 *
 * @author szucs
 */
public class Parkoló implements Comparable<Parkoló>{
    private String cím;
    private double terulet;
    private int kapacitás;
    private ArrayList<String> rendszám;

    public Parkoló(String cím, double terulet, int kapacitás, ArrayList<String> rendszám) {
        this.cím = cím;
        this.terulet = terulet;
        this.kapacitás = kapacitás;
        this.rendszám = rendszám;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    public void setTerulet(double terulet) {
        this.terulet = terulet;
    }

    public void setKapacitás(int kapacitás) {
        this.kapacitás = kapacitás;
    }

    public void setRendszám(ArrayList<String> rendszám) {
        this.rendszám = rendszám;
    }

    public String getCím() {
        return cím;
    }

    public double getTerulet() {
        return terulet;
    }

    public int getKapacitás() {
        return kapacitás;
    }

    public ArrayList<String> getRendszám() {
        return rendszám;
    }
    

    @Override
    public String toString() {
       StringBuilder sb= new StringBuilder();
       sb.append(cím).append(" ").append(Szabadhelyek());
       
       return sb.toString();
       
    }
    
    
               
    public int Szabadhelyek(){
        return kapacitás-rendszám.size();
    }
    
    
    
    
    
    
    
    
    
    @Override
    public int compareTo(Parkoló o) {
        if(this.Szabadhelyek()==o.Szabadhelyek())
            return this.cím.compareTo(o.getCím());
        else
            return (-1)*Integer.compare(Szabadhelyek(), o.Szabadhelyek());
    }
    
}
