/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mérlegelés;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author szucs
 */
public class Mérlegelés1 implements Comparable<Mérlegelés1>{
    private String név;
    private String telephely;
    private List dátum;
    private int bevétel;

    public Mérlegelés1(String név, String telephely) {
        this.név = név;
        this.telephely = telephely;
        this.dátum = new ArrayList<String>();
        this.bevétel = bevétel;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getTelephely() {
        return telephely;
    }

    public void setTelephely(String telephely) {
        this.telephely = telephely;
    }

    public List getDátum() {
        return dátum;
    }

    public void setDátum(List dátum) {
        this.dátum = dátum;
    }

    public int getBevétel() {
        return bevétel;
    }

    public void setBevétel(int bevétel) {
        this.bevétel = bevétel;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append(this.név).append(" (").append(this.telephely).append("): ").append(this.dátum);
        return sb.toString();
    }

    @Override
    public int compareTo(Mérlegelés1 o) {
      if(this.bevétel==o.getBevétel())
      {
          if(this.dátum.size()==o.getDátum().size()){
              return this.név.compareTo(o.getNév());
          }
      else
              return Integer.compare(this.dátum.size(), o.getDátum().size());
      }
      else
          return (-1)*Integer.compare(this.bevétel, o.getBevétel());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Mérlegelés1))
            return false;
        Mérlegelés1 m= (Mérlegelés1) obj;
        
        return this.név.equals(m.getNév()) && this.telephely.equals(m.getTelephely());
    }
    
    
    
}
