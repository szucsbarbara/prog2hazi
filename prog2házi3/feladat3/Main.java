/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat3;
import java.util.Scanner;
/**
 *
 * @author szucs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int n=Integer.parseInt(sc.nextLine());
       
       BudapestKupa [] tomb = new BudapestKupa [n];
       for(int i=0;i<n;i++)
       {
           String sor= sc.nextLine();
           String [] t=sor.split(";");
           
           int szum=0;
            for(int j=4;j<t.length;j++)
            {
                szum+=Integer.parseInt(t[j]);
            }
            tomb[i]=new BudapestKupa(Integer.parseInt(t[0]), Integer.parseInt(t[1]), Integer.parseInt(t[2]), t[3], szum);
       }
       
        sorrend(tomb);
        int m=maxTáv(tomb);
        for(int i=0;i<tomb.length;i++)
        {
            if(tomb[i].getRésztáv()==m)
                System.out.println(tomb[i].toString());
        }
        
    }
    
    public static void sorrend(BudapestKupa [] t2)
    {
        BudapestKupa tmp;
        
        for(int i=0;i<t2.length-1;i++)
        {
            for(int j=i+1;j<t2.length;j++)
            {
                if(t2[i].getÉv()>t2[j].getÉv())
                {
                    tmp=t2[i];
                    t2[i]=t2[j];
                    t2[j]=tmp;
                    
                }
                else if(t2[i].getÉv()==t2[j].getÉv())
                {
                    if(t2[i].getHónap()>t2[j].getHónap())
                    {
                        tmp=t2[i];
                    t2[i]=t2[j];
                    t2[j]=tmp;
                    }
                    else if (t2[i].getHónap()==t2[j].getHónap())
                            {
                                if(t2[i].getNap()>t2[j].getNap())
                                {
                                    
                                }
                                else if (t2[i].getTúraNeve().compareTo(t2[j].getTúraNeve()) >0 )
                                {
                                    tmp=t2[i];
                                     t2[i]=t2[j];
                                    t2[j]=tmp;
                                }
                                    
                                    
                                    
                            }
                }
                    
            }
        }
    }
    public static int maxTáv(BudapestKupa [] t3)
    {
        int max=t3[0].getRésztáv();
        for(int i=1;i<t3.length;i++)
        {
            if(t3[i].getRésztáv()>max)
                max=t3[i].getRésztáv();
        }
        
           return max;
    }
 
}



    


