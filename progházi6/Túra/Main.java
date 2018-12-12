/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Túra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author szucs
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Kéktúra> lista= new ArrayList<Kéktúra>();
        Scanner sc= null;
        String sor="";
        
        try{
            FileReader fr= new FileReader(new File("sample3.txt"));
            BufferedReader br= new BufferedReader(fr);
            sc= new Scanner(br);
            while(sc.hasNext())
            {
                sor=sc.nextLine();
                String [] darabolt=sor.split(":-");
                Kéktúra k = new Kéktúra(darabolt[0]);
                for(Kéktúra i: lista)
                {
                    if(i.equals(k))
                    {
                        i.getSzakasz_eleje().add(darabolt[1]);
                        i.getSzakasz_vége().add(darabolt[2]);
                    }
                    if(!lista.contains(k))
                    {
                          k.getSzakasz_eleje().add(darabolt[1]);
                k.getSzakasz_vége().add(darabolt[2]);
                lista.add(k);
                        
                    }
                       
                }
                
               
                
            }
          
        }
        catch(IOException e)
        {
            
        }
        Collections.sort(lista);
        for(Kéktúra i: lista)
        {
            if(összefüggő(i))
            {
                System.out.println(i.toString());
            }
        }
        
        
    }
    public static boolean összefüggő(Kéktúra k)
    {
        for(int i=0;i<k.getSzakasz_vége().size()-1;i++)
        {
            if(k.getSzakasz_eleje().get(i).compareTo(k.getSzakasz_eleje().get(i+1))!=0
                && k.getSzakasz_eleje().get(i).compareTo(k.getSzakasz_vége().get(i+1))!=0
                  && k.getSzakasz_vége().get(i).compareTo(k.getSzakasz_vége().get(i+1))!=0
                    &&k.getSzakasz_vége().get(i).compareTo(k.getSzakasz_eleje().get(i+1))!=0)
                
                return false;
    
        }
        return true;
    }
    
}
