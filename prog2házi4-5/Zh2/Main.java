/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zh;

import java.util.Scanner;

/**
 *
 * @author szucs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Hallgato [] t=new Hallgato [n];
        for(int i=0;i<n;i++)
        {
            String sor = sc.nextLine();
            String [] s=sor.split(" ");
            if(s[1].compareTo("igaz")==0)
                t[i]=new Hallgato(Integer.parseInt(s[0]), true);
            
            else if (s[1].compareTo("hamis")==0)
                t[i]=new Hallgato(Integer.parseInt(s[0]), false);
            
            
            
        }
        for(int i=0;i<n;i++)
        {
            Dolgozat do1=t[i].dolgozatotIr();
            Dolgozat do2=t[i].dolgozatotIr();
            
            if(do1.Megfelelt() && do2.Megfelelt())
                System.out.println("MEgfelelt");
            else 
            {
                 System.out.println("NEm felelt meg");
            }
               
            
            if(do1.getPontszam()==-1)
            {
                do1.Megfelelt();
            }
            else if(do2.getPontszam()==-1)
            {
                do2.Megfelelt();
            }
            
            
            
            
            
        }
            
        
        
    }
    
}
