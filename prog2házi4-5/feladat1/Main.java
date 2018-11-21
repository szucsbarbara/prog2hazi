/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat1;

import sun.security.util.Length;

/**
 *
 * @author szucs
 */
public class Main {
    public static void main(String[] args) {
        Bor [] tomb= new Bor [3];
        tomb[0]=new Bor("édes", 45.0, "FEhér", "Tokaj");
        tomb[1]=new Aszu(5, "félédes", 12.0, "piros", "villány");
        tomb[2]=new Bor("sós", 13.4, "fehrée", "eger");
        Keres(tomb);
        
    }
    public static void Keres(Bor [] t)
    {
        for(int i=0;i<t.length;i++)
            if(t[i] instanceof Aszu)
            {
                Aszu a=(Aszu)t[i];
                if(a.hanyPuttonyos()==5)
                    System.out.println(a.toString());
            }
    }
    
}
