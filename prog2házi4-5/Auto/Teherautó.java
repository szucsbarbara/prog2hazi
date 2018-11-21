/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_3;


public class Teherautó extends Autó {
    
    private int teherBírás;

 
    public Teherautó(int teherBírás, String rendszám, int teljesítmény, boolean automata) {
        super(rendszám, teljesítmény, automata);
        this.teherBírás = teherBírás;
    }

    
    public int getTeherBírás() {
        return teherBírás;
    }

    @Override
    public String toString() {
        return super.toString()+", teher bírás: "+this.teherBírás;
    }
    
}
