/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat3.newpackage;

import java.util.Scanner;

/**

/**
 *
 * @author szucs
 */
public class Teszt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String m=sc.nextLine();

        String[] elso=m.split(" ");
        int n=Integer.parseInt(elso[0]);
        String telepules=elso[1];
        IzzasztóFeladat [] tomb = new IzzasztóFeladat[n];
        for(int i=0;i<n;i++)
        {

            String sor=sc.nextLine();
            String [] t=sor.split(":");
            tomb[i]= new IzzasztóFeladat(t[0], Integer.parseInt(t[1]));
            
        }
        kiir(tomb, telepules);

    }
    public static void kiir(IzzasztóFeladat [] t1, String nev)
    {
        boolean igaz_e=false;
        int homers=0;
        IzzasztóFeladat tmp;
        
        for(int i=0;i<t1.length;i++)
        {
            if(t1[i].getNév().compareTo(nev)==0){
                igaz_e=true;
            homers=t1[i].getHőmérséklet();
            }
                
            
        }
        if(igaz_e==true)
           
        {
            for(int i=0;i<t1.length-1;i++)
            {
                for(int j=i+1;j<t1.length;j++)
                    if(t1[i].getHőmérséklet()<t1[j].getHőmérséklet())
                    {
                        tmp=t1[i];
                    t1[i]=t1[j];
                    t1[j]=tmp;
                    }
                    else if(t1[i].getHőmérséklet()==t1[j].getHőmérséklet())
                    {
                        if(t1[i].getNév().compareTo(t1[j].getNév())>0)
                        {
                            tmp=t1[i];
                            t1[i]=t1[j];
                            t1[j]=tmp;
                        }
                            
                    }
                    
            }
            for(int i=0;i<t1.length;i++)
                if(t1[i].getHőmérséklet()>homers)
                    System.out.println(t1[i].toString());
        }
        else
            System.out.println("Missing data");
        
        
    
        
        
    }
    
}


