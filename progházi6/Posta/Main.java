/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
        Scanner sc= null;
        ArrayList<Irányítószám> list = new ArrayList();
        String sor="";
        try{
            FileReader fr= new FileReader(new File("sample1.txt"));
            BufferedReader br= new BufferedReader(fr);
            sc=new Scanner(br);
            while(sc.hasNext())
            {
                sor=sc.nextLine();
                String darabolt[]= sor.split(":");
                PostaiKüldemény k= new PostaiKüldemény(darabolt[0], darabolt[2], darabolt[3], Integer.parseInt(darabolt[4]), Integer.parseInt(darabolt[5]));
                for(Irányítószám i:list)
                {
                    if(i.getIrányítószám()==Integer.parseInt(darabolt[1]))
                    {
                        i.getLista().add(k);
                        i.setSzum(i.getSzum()+k.getCsomag_értéke());
                    }
                    
                    
                }
                if(!(list.contains(new Irányítószám(Integer.parseInt(darabolt[1])))))
                    {
                        Irányítószám uj= new Irányítószám(Integer.parseInt(darabolt[1]));
                        uj.getLista().add(k);
                        uj.setSzum(uj.getSzum()+k.getCsomag_értéke());
                        list.add(uj);
                    }
            }
            
        }
        catch(IOException e){
            
        }
        for(Irányítószám i: list)
        {
            Collections.sort(i.getLista());
            
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        try{
        FileWriter fw = new FileWriter("ki1.txt");
        BufferedWriter bw= new BufferedWriter(fw);
        for(Irányítószám i: list)
        {
          bw.write(i.getIrányítószám()+": "+i.getSzum()+": \n"+i.getLista());
          bw.write("\n");
        }
        bw.close();
  
}
        catch(IOException e)
        {
        
        }
        }
    
    
}
