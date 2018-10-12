/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

import java.util.Scanner;

/**
 *
 * @author szucs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String napok=sc.nextLine();
        
        int szam=Integer.parseInt(sc.nextLine());
        Ora t[]=new Ora[szam];
        
        for(int i=0;i<szam;i++)
        {
            int kod=Integer.parseInt(sc.nextLine());
            int kezdes=Integer.parseInt(sc.nextLine());
            String nev=sc.nextLine();
            t[i]=new Ora(kod, nev, kezdes);
            
            
        }
        Orarend o=new Orarend(napok);
        for(int i=0;i<szam;i++)
        {
            System.out.println(o.OratHozzaad(t[i]));     
       
        }
        System.out.println(o.toString());
            
        
        
    }
    
    
}
