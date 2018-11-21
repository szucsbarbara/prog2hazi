/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karácsony;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author szucs
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <Hozzávalók>list= new ArrayList<Hozzávalók>();
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        while(sor.length()>0)
        {
            String [] darabolt= sor.split(";");
            Hozzávalók uj= new Hozzávalók(darabolt[0], Integer.parseInt(darabolt[1]));
            for(Hozzávalók h : list)
            {
                if(h.equals(uj))
                    h.setMennyiség(h.getMennyiség()+uj.getMennyiség());
            }
            if(!list.contains(uj))
            {
                list.add(uj);
            }
            
            sor=sc.nextLine();
            
        }
        Collections.sort(list);
        
        for(Hozzávalók i:list)
            System.out.println(i);
        
        
        
        
        
    }
    
}
