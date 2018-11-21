/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zh;

import Egyetem.Pontozhato;

/**
 *
 * @author szucs
 */
public class Dolgozat implements Pontozhato{
    public int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public boolean Megfelelt() {
        if(pontszam > 35)
            return true;
        else if(pontszam==-1)
        {
            System.out.println("Nem írt");
        return false;
        }
            
        else 
            return false;
        
        
        
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return "Dolgozat{" + "pontszam=" + pontszam + '}';
    }
    
    
}
