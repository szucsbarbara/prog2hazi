/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package másféllépés;

import java.util.Scanner;

/**
 *
 * @author szucs
 */
public class TestM {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        
        MásfélMillióLépés [] tomb=new MásfélMillióLépés[n];
        for(int i=0;i<tomb.length;i++)
        {
            String sor=sc.nextLine();
            String [] t=sor.split(";");
            int kék_count=0;
            int egyéb_count=0;
            
            for(int j=0;j<t[1].length();j++)
            {
                if(t[1].charAt(j)=='K')
                {
                    kék_count++;
                }
                else if(t[1].charAt(j)=='P' || t[1].charAt(j)=='S' || t[1].charAt(j)=='Z')
                {
                    egyéb_count++;
                }
            }
            
            tomb[i]=new MásfélMillióLépés(t[0], t[1], kék_count, egyéb_count);
            
            
            
            
            
            
        }
        rendez(tomb);
        for(int i=0;i<tomb.length;i++)
        {
            System.out.println(tomb[i].getTurista_név());
        }
    }
    public static void rendez(MásfélMillióLépés [] t1)
    {
        MásfélMillióLépés tmp;
        for(int i=0;i<t1.length-1;i++)
        {
            for(int j=i+1;j<t1.length;j++)
            {
                if(t1[i].getSzum1()<t1[j].getSzum2())
                {
                       tmp=t1[i];
                t1[i]=t1[j];
                t1[j]=tmp;
                }
                else if(t1[i].getSzum1()==t1[j].getSzum2())
                {
                    if(t1[i].getTurista_név().compareTo(t1[j].getTurista_név())>0)
                    {
                        tmp=t1[i];
                t1[i]=t1[j];
                t1[j]=tmp;
                    }
                        
                }
                 
            }
        }
    }
    
}
