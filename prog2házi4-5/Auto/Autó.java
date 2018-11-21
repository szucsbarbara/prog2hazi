/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_3;

import java.util.Arrays;
import java.util.List;


public class Autó implements Comparable<Autó>{
    private String rendszám;
    private int teljesítmény;
    private boolean automata;
    private static int db=0;
    private List<String> extrák;

   
    public Autó(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
        hánydb();
    }

    
    public String getRendszám() {
        return rendszám;
    }

    
    public int getTeljesítmény() {
        return teljesítmény;
    }

   
    public boolean isAutomata() {
        return automata;
    }

    
    public List<String> getExtrák() {
        return extrák;
    }
    
   
    public Autó addExtra(Autó a, String[] extrák) {
        List<String> extrák1=Arrays.asList(extrák);
        
        a.extrák=extrák1;
        
        return a;
    }
    
 
    public Autó törölExtra(Autó a){
        a.extrák=null;
        
        return a;
    }
    
   
    public static int hánydb() {
        return Autó.db++;
    }

    @Override
    public String toString() {
        return "Autó " + "rendszáma: " + rendszám + ", teljesítménye: " + teljesítmény + ", automata: " + automata;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Autó))
            return false;
        
        Autó a=(Autó)obj;
        
        return this.rendszám.equals(a.getRendszám());
    }   

   
    @Override
    public int compareTo(Autó t) {
        return this.teljesítmény-t.teljesítmény;
    }
    
   
    public static boolean szabályos(Autó a){
        String rendszám =a.getRendszám();
        int count=0;
        int count2=0;
        
        char[] chars=rendszám.toCharArray();
        
        for(int i=0; i<3; i++)
            if(Character.isLetter(chars[i]))
                count++;
        
        char[] számok=rendszám.toCharArray();
        
        for(int j=3; j<6; j++)
            if(Character.isDigit(számok[j]))
                count2++;
        
        if(count==3 && count2==3)
            return true;
        
        return false;
    }
    
}