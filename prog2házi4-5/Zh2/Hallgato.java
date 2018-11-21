/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zh;

import java.util.Random;

/**
 *
 * @author szucs
 */
public class Hallgato {
    private int mennyitKeszult;
    private boolean sokatTanult;
   

    public Hallgato(int mennyitKeszult, boolean sokatTanult) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanult = sokatTanult;
    }
    public Dolgozat dolgozatotIr(){
        Random rnd2= new Random();
        int n2= rnd2.nextInt(100);
        if(n2>2)
        {
            if(sokatTanult){
        Random rnd= new Random();
        int n=rnd.nextInt(4)+4;
        int d= n*mennyitKeszult;
        return new Dolgozat(d);
        
    }
        else
        {
            Random rnd1= new Random();
        int n1=rnd1.nextInt(6);
        int d1=n1*mennyitKeszult;
        return new Dolgozat(d1);
        }   
        }
        else
            return new Dolgozat(-1);
        
        
        
    
    }
}
