/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fagyi;

/**
 *
 * @author szucs
 */
public class Ízek {
    private String név;
    private int ár;

    public Ízek(String név, int ár) {
        this.név = név;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getÁr() {
        return ár;
    }

    public void setÁr(int ár) {
        this.ár = ár;
    }
    
    
}
