/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package másféllépés;

/**
 *
 * @author szucs
 */
public class MásfélMillióLépés {
    private String turista_név;
    private String utvonal_neve;
    private int szum1;
    private int szum2;

    public MásfélMillióLépés(String turista_név, String utvonal_neve, int szum1, int szum2) {
        this.turista_név = turista_név;
        this.utvonal_neve = utvonal_neve;
        this.szum1 = szum1;
        this.szum2 = szum2;
    }

    public String getTurista_név() {
        return turista_név;
    }

    public String getUtvonal_neve() {
        return utvonal_neve;
    }

    public int getSzum1() {
        return szum1;
    }

    public int getSzum2() {
        return szum2;
    }

    public void setTurista_név(String turista_név) {
        this.turista_név = turista_név;
    }

    public void setUtvonal_neve(String utvonal_neve) {
        this.utvonal_neve = utvonal_neve;
    }

    public void setSzum1(int szum1) {
        this.szum1 = szum1;
    }

    public void setSzum2(int szum2) {
        this.szum2 = szum2;
    }

    @Override
    public String toString() {
        return "M\u00e1sf\u00e9lMilli\u00f3L\u00e9p\u00e9s{" + "turista_n\u00e9v=" + turista_név + ", utvonal_neve=" + utvonal_neve + ", szum1=" + szum1 + ", szum2=" + szum2 + '}';
    }
    
    
}
