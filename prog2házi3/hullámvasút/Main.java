/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;


import java.util.Scanner;

/**
 *
 * @author szucs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
    
        Hullámvasút [] tomb= new Hullámvasút [n];
        
        for(int i=1;i<n;i++)
        {
            String sor=sc.nextLine();
            String [] t=sor.split(";");
             tomb[i]= new Hullámvasút(t[0], t[1], Integer.parseInt(t[2]), Integer.parseInt(t[3]));
        }
        
        Rendez(tomb);
        for(int i=0;i<tomb.length;i++)
        {
            System.out.println(tomb[i].toString());
        }
       
       
        
        
    }
    public static void Rendez(Hullámvasút [] t1)
    {
        Hullámvasút tmp;
        for(int i=0;i<t1.length-1;i++)
        {
            for(int j=i+1;j<t1.length;j++)
                if(t1[i].getVárakozási_idő()>t1[j].getVárakozási_idő())
                {
                    tmp=t1[i];
                    t1[i]=t1[j];
                    t1[j]=tmp;
                    
                }
                else if(t1[i].getVárakozási_idő()==t1[j].getVárakozási_idő())
                {
                    if(t1[i].getLegkisebb_magasság()<t1[j].getLegkisebb_magasság())
                    {
                        tmp=t1[i];
                    t1[i]=t1[j];
                    t1[j]=tmp;
                    
                    }
                    else if (t1[i].getHullámvasút_neve().compareTo(t1[j].getHullámvasút_neve())> 0)
                    {
                        tmp=t1[i];
                    t1[i]=t1[j];
                    t1[j]=tmp;
                    }
                }
        }
        
    }
    
}
