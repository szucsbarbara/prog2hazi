/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat3;

/**
 *
 * @author szucs
 */
public class BudapestKupa {
   
    private int év; int hónap; int nap;
    private String TúraNeve;
    private int résztáv;

    public BudapestKupa(int év, int hónap, int nap, String TúraNeve, int résztáv) {
        
        this.év = év;
        this.hónap = hónap;
        this.nap = nap;
        this.TúraNeve = TúraNeve;
        this.résztáv = résztáv;
    }

    

    public int getÉv() {
        return év;
    }

    public int getHónap() {
        return hónap;
    }

    public int getNap() {
        return nap;
    }

    public String getTúraNeve() {
        return TúraNeve;
    }

    public int getRésztáv() {
        return résztáv;
    }

   

    public void setÉv(int év) {
        this.év = év;
    }

    public void setHónap(int hónap) {
        this.hónap = hónap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }

    public void setTúraNeve(String TúraNeve) {
        this.TúraNeve = TúraNeve;
    }

    public void setRésztáv(int résztáv) {
        this.résztáv = résztáv;
    }

    @Override
    public String toString() {
        return "BudapestKupa{" + "N="  + ", \u00e9v=" + év + ", h\u00f3nap=" + hónap + ", nap=" + nap + ", T\u00faraNeve=" + TúraNeve + ", r\u00e9szt\u00e1v=" + résztáv + '}';
    }
    
    
    
    
    
    
    
}
