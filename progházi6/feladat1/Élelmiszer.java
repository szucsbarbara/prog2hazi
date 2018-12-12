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
public class Élelmiszer {
    private String név;
    private String mennyiségiE;
    private double egységár;
    private int szavatosság;
    private int db=1;
    

    public Élelmiszer(String név, String mennyiségiE, double egységár, int szavatosság) {
        this.név = név;
        this.mennyiségiE = mennyiségiE;
        this.egységár = egységár;
        this.szavatosság = szavatosság;
        this.db=db;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getMennyiségiE() {
        return mennyiségiE;
    }

    public void setMennyiségiE(String mennyiségiE) {
        this.mennyiségiE = mennyiségiE;
    }

    public double getEgységár() {
        return egységár;
    }

    public void setEgységár(double egységár) {
        this.egységár = egységár;
    }

    public int getSzavatosság() {
        return szavatosság;
    }

    public void setSzavatosság(int szavatosság) {
        this.szavatosság = szavatosság;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj==null || !(obj instanceof Élelmiszer))
               return false;
       
       Élelmiszer é = (Élelmiszer) obj;
       
       return this.egységár==é.getEgységár() && this.mennyiségiE.equals(é.getMennyiségiE()) && 
               this.név.equals(é.getNév()) && this.szavatosság==é.getSzavatosság();
    }
    
}


