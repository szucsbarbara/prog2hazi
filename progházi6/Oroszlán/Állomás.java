/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oroszlán;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author szucs
 */
public class Állomás {
    private String azonosító;
    private String felvétel;

    public Állomás(String azonosító, String felvétel) {
        this.azonosító = azonosító;
        this.felvétel = felvétel;
    }

    public String getAzonosító() {
        return azonosító;
    }

    public String getFelvétel() {
        return felvétel;
    }
    
    public List<Integer> oroszlánüvöltésPoz()
    {
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<this.felvétel.length();i++)
        {
            if(this.felvétel.charAt(i)=='0')
                list.add(i);
        }
        
        
        return list;
        
        
    }
    
}
