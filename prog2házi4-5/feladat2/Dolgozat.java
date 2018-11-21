/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

/**
 *
 * @author szucs
 */
public class Dolgozat {
    public static void main(String[] args) {
        Ital [] tomb = new Ital [4];
        tomb[0]=new Ital("kóla", "2", 200);
        tomb[1]=new Szeszesital("bor", "1", 450, 12.0);
        tomb[2]=new Szeszesital("pezsgő0", "5 l", 2222, 12.1);
        tomb[3]=new Szeszesital("sor", "5 dl", 22, 33.1);
        
        haromlegmagasabb(tomb);
        
    }
    
    public static void haromlegmagasabb(Ital [] tomb)
            
    {
        int n=0;
        Szeszesital[] t; 
        t = new Szeszesital [tomb.length];
        for(int i=0;i<tomb.length;i++)
        {
            if(tomb[i] instanceof Szeszesital)
            {
                t[n]=(Szeszesital)tomb[i];
                n++;
            }
        }
        Szeszesital tmp;
        for(int i=0;t[i+1]!=null;i++)
        {
            for(int j=i+1;t[j]!=null;j++)
                if(t[i].getAlkoholTartalom()<t[j].getAlkoholTartalom())
                {
                    tmp=t[i];
                    t[i]=t[j];
                    t[j]=tmp;
                }
                    
            
        }
        if(n<3)
        {
            System.out.println("NULL");
            
        }
        else
            for(int i=0;i<3;i++)
            {
                System.out.println(t[i]);
            }
        
        
    }
}
