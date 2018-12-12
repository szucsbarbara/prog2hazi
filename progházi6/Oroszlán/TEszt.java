/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oroszlán;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author szucs
 */
public class TEszt {
    public static void oroszlanSzamol(List <Állomás> lista)
    {
       List<Integer> tmp=lista.get(0).oroszlánüvöltésPoz();
       for(Állomás i: lista)
       {
           tmp.retainAll(i.oroszlánüvöltésPoz());
           
           
       }
       
        System.out.println(tmp.size());
    }
    public static void main(String[] args) throws IOException {
        List<Állomás> lista= new ArrayList<>();
        try{
            FileReader fr= new FileReader(new File("sample2.txt"));
            BufferedReader br = new BufferedReader(fr);
            
            String sor;
            while((sor=br.readLine())!= null)
            {
                if(sor.equals("END"))
                {
                    oroszlanSzamol(lista);
                    
                    lista.clear();
                }
                else
                {
                    String [] darabolt = sor.split(":");
                    Állomás á = new Állomás(darabolt[0], darabolt[1]);
                    lista.add(á);
                }
            }
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
