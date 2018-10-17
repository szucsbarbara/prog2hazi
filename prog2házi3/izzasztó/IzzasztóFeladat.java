/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat3.newpackage;

/**
 *
 * @author szucs
 */
public class IzzasztóFeladat {
    private String név;
    private int hőmérséklet;

    public IzzasztóFeladat(String név, int hőmérséklet) {
        this.név = név;
        this.hőmérséklet = hőmérséklet;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getHőmérséklet() {
        return hőmérséklet;
    }

    public void setHőmérséklet(int hőmérséklet) {
        this.hőmérséklet = hőmérséklet;
    }

    @Override
    public String toString() {
        return "Izzaszt\u00f3Feladat{" + "n\u00e9v=" + név + ", h\u0151m\u00e9rs\u00e9klet=" + hőmérséklet + '}';
    }

    
    
}
