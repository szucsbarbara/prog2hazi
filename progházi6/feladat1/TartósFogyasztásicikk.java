/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat1;

import java.util.Objects;

/**
 *
 * @author szucs
 */
public class TartósFogyasztásicikk {
    private String név;
    private String mennyiség;
    private double egységár;
    private int db=1;

    public TartósFogyasztásicikk(String név, String mennyiség, double egységár) {
        this.név = név;
        this.mennyiség = mennyiség;
        this.egységár = egységár;
        this.db=db;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getMennyiség() {
        return mennyiség;
    }

    public void setMennyiség(String mennyiség) {
        this.mennyiség = mennyiség;
    }

    public double getEgységár() {
        return egységár;
    }

    public void setEgységár(double egységár) {
        this.egységár = egységár;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof TartósFogyasztásicikk))
            return false;
        
        TartósFogyasztásicikk t= (TartósFogyasztásicikk) obj;
        return this.egységár==t.getEgységár() && this.mennyiség.equals(t.getMennyiség()) && this.név.equals(t.getNév());
    }
    
    
    
    
}
