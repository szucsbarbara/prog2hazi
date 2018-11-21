/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladatbankkártya;

import java.util.Scanner;

/**
 *
 * @author szucs
 */
public class Bankkártya {
    
    
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        while(sor.compareTo("0")!=0)
        {
            String [] tomb = sor.split("");
            nez(tomb);
            sor=sc.nextLine();
                    
        }
    }
    
    public static void nez(String [] t)
    {
        
        int n=1;
        for(int i=t.length-1;i>=0;i--)
        {
            if(n%2==0)
            {
                int k=Integer.parseInt(t[i])*2;
                if(k>=10)
                    k=k-9;
                t[i]=String.valueOf(k);
                n++;
            }
            else
                n++;
        }
        int sum=0;
        for(int i=0;i<t.length;i++)
        {
            sum+=Integer.parseInt(t[i]);
        }
        if(sum%10==0)
            System.out.println("YES");
        else
            System.out.println("NO");
            
    }
}
