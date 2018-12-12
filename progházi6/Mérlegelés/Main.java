/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mérlegelés;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author szucs
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Mérlegelés1> lista= new ArrayList<Mérlegelés1>();
    try{
    FileReader fr = new FileReader(new File("sample.txt"));
    BufferedReader br = new BufferedReader(fr);
    
    String sor;
    while((sor=br.readLine())!=null)
    {
        String [] tmp = sor.split(":");
        Mérlegelés1 m = new Mérlegelés1(tmp[0], tmp[1]);
        for(Mérlegelés1 i: lista)
        {
            if(m.equals(i)){
                i.getDátum().add(tmp[2]);
                i.setBevétel(i.getBevétel()+Integer.parseInt(tmp[3]));
                
            }
        }
        if(!(lista.contains(m)))
        {
            m.getDátum().add(tmp[2]);
            m.setBevétel(Integer.parseInt(tmp[3]));
            lista.add(m);
        }
        
        
    }
    br.close();
    
    }
    catch(IOException e){
        System.out.println("Fájl nem található");
    }
        Collections.sort(lista);
    try{
        FileWriter fw=new FileWriter(new File("ki.txt"));
        BufferedWriter bw=new BufferedWriter(fw);
        
        for(Mérlegelés1 i: lista)
        {
            bw.write(i.toString());
        }
        bw.close();
    }
    catch(IOException e)
    {
        
    }
    }
    
    }


