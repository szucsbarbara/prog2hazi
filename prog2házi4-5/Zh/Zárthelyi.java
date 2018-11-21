/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zh;

import java.util.Objects;

/**
 *
 * @author szucs
 */
public class Zárthelyi implements Comparable<Zárthelyi>{

    private String név;
    private int pontszám;

    public Zárthelyi(String név, int pontszám) {
        this.név = név;
        this.pontszám = pontszám;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getPontszám() {
        return pontszám;
    }

    public void setPontszám(int pontszám) {
        this.pontszám = pontszám;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append(név).append(":").append(" ").append(pontszám).append(" ").append("pont");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Zárthelyi))
            return false;
        Zárthelyi z=(Zárthelyi) obj;
        
        return this.név.equals(z.getNév());
    }
    
   
    
    @Override
    public int compareTo(Zárthelyi o) {
        if(this.pontszám==o.getPontszám())
            return this.név.compareTo(o.getNév());
        else
        {
            
            return (-1)*Integer.compare(this.pontszám, o.getPontszám());
        }
    }
    
    
}
