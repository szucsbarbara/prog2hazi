/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author szucs
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Zárthelyi> lista= new ArrayList<Zárthelyi>();
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        
        while(sor.length()>0)
        {
            String [] darabolt=sor.split(";");
            Zárthelyi uj=new Zárthelyi(darabolt[0], Integer.parseInt(darabolt[1]));
            
            for(Zárthelyi z1: lista)
            {
                if(z1.equals(uj))
                    z1.setPontszám(z1.getPontszám()+uj.getPontszám());
            }
            if(!lista.contains(uj))
            {
                lista.add(uj);
            }
            sor=sc.nextLine();
        }
        Collections.sort(lista);
        
        
        for(Zárthelyi i: lista)
        {
            System.out.println(i);
        }
    }
    
    
    
}
