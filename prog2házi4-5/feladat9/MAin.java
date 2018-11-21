/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat9;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author szucs
 */
public class MAin {
    public static void main(String[] args) {
        ArrayList<Hátizsák> list=new ArrayList<>();
        list.add(new Hátizsák("adiadas", 12, 4, true));
        list.add(new Hátizsák("Nike", 11, 45, false));
        list.add(new Hátizsák("budmil", 23, 5, true));
        
        kiírHátizsák(list);
    }
    public static void kiírHátizsák(ArrayList<Hátizsák> list)
    {
        Collections.sort(list, new HátizsákRendező());
        for(int i =0;i<list.size();i++)
            System.out.println(list.get(i));
    }
    
}
