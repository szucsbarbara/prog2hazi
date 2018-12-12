/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posta;

import java.util.ArrayList;

/**
 *
 * @author szucs
 */
public class Irányítószám implements Comparable<Irányítószám>{
    private int irányítószám;
    private ArrayList<PostaiKüldemény> lista;
    private int szum;

    public Irányítószám(int irányítószám) {
        this.irányítószám = irányítószám;
        this.lista=new ArrayList();
        this.szum=0;
    }

    public int getIrányítószám() {
        return irányítószám;
    }

    public void setIrányítószám(int irányítószám) {
        this.irányítószám = irányítószám;
    }

    public ArrayList<PostaiKüldemény> getLista() {
        return lista;
    }

    public void setLista(ArrayList<PostaiKüldemény> lista) {
        this.lista = lista;
    }

    public int getSzum() {
        return szum;
    }

    public void setSzum(int szum) {
        this.szum = szum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Irányítószám))
            return false;
        Irányítószám i=(Irányítószám) obj;
        
        return this.irányítószám==i.getIrányítószám();
    }

    @Override
    public int compareTo(Irányítószám o) {
        return Integer.compare(this.irányítószám, o.getIrányítószám());
           
    }

    @Override
    public String toString() {
        return "Ir\u00e1ny\u00edt\u00f3sz\u00e1m{" + "ir\u00e1ny\u00edt\u00f3sz\u00e1m=" + irányítószám + ", lista=" + lista + ", szum=" + szum + '}';
    }
    
    
    
    
}
