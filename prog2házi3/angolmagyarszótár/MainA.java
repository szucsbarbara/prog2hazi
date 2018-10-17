/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.newpackage;

import java.util.Scanner;

/**
 *
 * @author szucs
 */
public class MainA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        
        AngolMagyarSzótár [] tomb= new AngolMagyarSzótár[n];
        for(int i=0;i<n;i++)
        {
            String sor  = sc.nextLine();
            String t[]= sor.split(":");
            tomb[i]= new AngolMagyarSzótár(t[0], t[1]);
            
        }
        rendez(tomb);
        
        for(int i=0;i<tomb.length;i++)
        {
            System.out.println(tomb[i].toString());
        }
    }
    public static void rendez(AngolMagyarSzótár [] t)
    {
        AngolMagyarSzótár tmp;
        for(int i=0;i<t.length-1;i++)
        {
            for(int j=i+1;j<t.length;j++)
            {
                if(t[i].getAngol_szó().compareTo(t[j].getAngol_szó())>0)
                    
                {
                  tmp=t[i];
                  t[i]=t[j];
                  t[j]=tmp;
                }
                else if(t[i].getMagyar_szó().compareTo(t[j].getMagyar_szó())>0)
                {
                    tmp=t[i];
                  t[i]=t[j];
                  t[j]=tmp;
                }
                
            }
        }
        
        
    }
}

