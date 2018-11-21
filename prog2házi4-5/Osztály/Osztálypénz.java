/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Osztály;

import java.util.Objects;

/**
 *
 * @author szucs
 */
public class Osztálypénz implements Comparable<Osztálypénz>{

    private String név;
    private int pénz;

    public Osztálypénz(String név, int pénz) {
        this.név = név;
        this.pénz = pénz;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getPénz() {
        return pénz;
    }

    public void setPénz(int pénz) {
        this.pénz = pénz;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append(név).append(";").append(pénz);
        
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Osztálypénz))
            return false;
        
        Osztálypénz p= (Osztálypénz) obj;
        
      return this.név.equals(p.név);
        
    }
    
    @Override
    public int compareTo(Osztálypénz o) {
       if(this.pénz==o.getPénz())
       {
           return this.név.compareTo(o.getNév());
       }
       
       else
       {
           return (-1)*Integer.compare(this.pénz, o.getPénz());
       }
           
    }
    
}
