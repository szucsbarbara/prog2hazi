/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat9;

import java.util.Comparator;

/**
 *
 * @author szucs
 */
public class HátizsákRendező implements Comparator<Hátizsák>{
    @Override
    public int compare(Hátizsák obj1, Hátizsák obj2){
        if(obj1.getMárka().compareTo(obj2.getMárka())==0)
            return (int)(obj1.getZsebekSzáma()-obj2.getZsebekSzáma());
        else
           return (obj1.getMárka().compareTo(obj2.getMárka()));
}
}
