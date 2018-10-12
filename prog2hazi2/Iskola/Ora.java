/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

/**
 *
 * @author szucs
 */
public class Ora {
    private int kod;
    private String név;
    private int kezdete;

    public Ora(int kod, String név, int kezdete) {
        this.kod = kod;
        this.név = név;
        if(kezdete<8)
            this.kezdete=8;
        else if(kezdete>19)
            this.kezdete=19;
        else
            this.kezdete=kezdete;
    }

    public int getKod() {
        return kod;
    }

    public String getNév() {
        return név;
    }

    public int getKezdete() {
        return kezdete;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setKezdete(int kezdete) {
        this.kezdete = kezdete;
    }

    @Override
    public String toString() {
        return "Ora{" + "kod=" + kod + ", n\u00e9v=" + név + ", kezdete=" + kezdete + '}';
    }
    
    
    
    
    
}
