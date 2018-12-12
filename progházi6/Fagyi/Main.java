/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fagyi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author szucs
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <TéliFagyi> lista= new ArrayList<TéliFagyi>();
        Scanner sc=null;
        String sor="";
        
        try{
            FileReader fr=new FileReader(new File("sample4.txt"));
            BufferedReader br= new BufferedReader(fr);
            sc= new Scanner(br);
            while(sc.hasNext())
            {
                sor=sc.nextLine();
                String [] darabolt= sor.split(";");
                TéliFagyi t = new TéliFagyi();
                
                for(int i=1;i<darabolt.length;i++)
                {
                    t.getRendelés().add(darabolt[i]);
                    
                }
                lista.add(t);
            }
            
        }
        catch(IOException e)
        {
            System.out.println("baj van");
        }
        
       Scanner sc2=new Scanner(System.in);
       ArrayList<Ízek> lista2= new ArrayList<>();
       while((sor=sc2.nextLine()).length()>0)
       {
           String [] darabolt = sor.split(";");
           Ízek i= new Ízek(darabolt[0], Integer.parseInt(darabolt[1]));
           lista2.add(i);
           
       }
        számol(lista2, lista);
    }
    
    public static void számol(ArrayList<Ízek> lista, ArrayList<TéliFagyi> lista2)
    {
        int szamlalo=0;
        int szum=0;
        int belso_szum=0;
        boolean teljesitheto=true;
        
        for(TéliFagyi i: lista2)
        {
            for(int j=0;j<i.getRendelés().size();j++)
            {
                for(Ízek k: lista)
                {
                    if(i.getRendelés().get(j).compareTo(k.getNév())!=0)
                        continue;
                    else{
                        belso_szum+=k.getÁr();
                    }
                    
                }
                
            }
            if(teljesitheto)
            {
                szum+=belso_szum;
                szamlalo++;
                belso_szum=0;
            }
            teljesitheto=true;
        }
        System.out.println(szamlalo+" "+szum);
        
    }
    
    
}
