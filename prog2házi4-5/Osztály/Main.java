/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Osztály;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author szucs
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Osztálypénz> lista= new ArrayList<Osztálypénz>();
        Scanner sc= new Scanner(System.in);
        String sor=sc.nextLine();
        while(sor.length()>0)
        {
            String [] darabolt=sor.split(";");
            Osztálypénz uj=new Osztálypénz(darabolt[0], Integer.parseInt(darabolt[1]));
            for( Osztálypénz osz: lista)
            {
                if(osz.equals(uj))
                    osz.setPénz(osz.getPénz()+uj.getPénz());
                
            }
            if(!lista.contains(uj))
            {
                lista.add(uj);
            }
            
            sor=sc.nextLine();
        }
        Collections.sort(lista);
        
        
        for(Osztálypénz i: lista)
            System.out.println(i);
    }
    
    
    
    
}
