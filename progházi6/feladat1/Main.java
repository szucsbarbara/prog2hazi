/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat1;

import java.io.BufferedReader;
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
        String sor = "";
        Scanner sc=null;
        ArrayList<Élelmiszer> lista1= new ArrayList();
        ArrayList<TartósFogyasztásicikk> lista2= new ArrayList();
        
        
        try{
            FileReader fr = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(fr);
            sc= new Scanner(br);
            while(sc.hasNext()){
                sor=sc.nextLine();
                String [] darabolt=sor.split(";");
                if(darabolt[0].compareTo("T")==0)
                {
                    TartósFogyasztásicikk T = new TartósFogyasztásicikk(darabolt[1], darabolt[2], Double.parseDouble(darabolt[3]));
                    for(TartósFogyasztásicikk a: lista2)
                    {
                        if(a.equals(T))
                        {
                            a.setMennyiség(a.getMennyiség()+darabolt[4]);
                        }
                        
                    }
                }
                else if(darabolt[0].compareTo("E")==0)
                {
                    
                    
                    Élelmiszer É= new Élelmiszer(darabolt[1], darabolt[2], Double.parseDouble(darabolt[3]), Integer.parseInt(darabolt[4]));
                    for(Élelmiszer b: lista1)
                    {
                        if(b.equals(É))
                        {
                            b.setMennyiségiE(b.getMennyiségiE()+darabolt[5]);
                        }
                    }
                    
                }
                
                
            }
            
            
            
        }
        catch(IOException e){
        
        
    }
    }
}
