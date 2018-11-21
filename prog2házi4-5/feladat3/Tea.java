/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat3;

/**
 *
 * @author szucs
 */
public class Tea implements rendezheto{
    
    
    public String nev;
    public int ár;
    public Tea(String s,int j) {
        nev=s;
       ár=j;
}
    public boolean egyenlo(Object o){
        Tea t=(Tea)o;
        if(t.ár==this.ár)
            return true;
        else
            return false;
        
    }
    public boolean nagyobbMint(Object o)
    { 
        Tea t=(Tea)o;
        if(t.ár>this.ár)
            return true;
        else
            return false;
        
    }
    public boolean kisebbMint(Object o)
    {
        Tea t=(Tea)o;
        if(t.ár<this.ár)
            return true;
        else
            return false;
    }

}
