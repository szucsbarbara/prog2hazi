/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karácsony;

/**
 *
 * @author szucs
 */
public class Hozzávalók implements Comparable<Hozzávalók>{
    private String alapanyag;
    private int mennyiség;
    

    public Hozzávalók(String alapanyag, int mennyiség) {
        this.mennyiség = mennyiség;
        this.alapanyag = alapanyag;
    }

    public int getMennyiség() {
        return mennyiség;
    }

    public void setMennyiség(int mennyiség) {
        this.mennyiség = mennyiség;
    }

    public String getAlapanyag() {
        return alapanyag;
    }

    public void setAlapanyag(String alapanyag) {
        this.alapanyag = alapanyag;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append(this.alapanyag).append(";").append(this.mennyiség);
        return sb.toString();
        
    }
    
    
    
     
    @Override
    public int compareTo(Hozzávalók o) {
        if(this.mennyiség == o.getMennyiség())
        {
            return this.alapanyag.compareTo(o.getAlapanyag());
        }
            
        else
        {
            return (-1)*Integer.compare(this.mennyiség, o.getMennyiség());
        }  
            
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Hozzávalók))
            return false;
       Hozzávalók h= (Hozzávalók) obj;
       
        return this.alapanyag.equals(h.alapanyag);
    }
    
    
     
    
}
