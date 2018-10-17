/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katonák;

/**
 *
 * @author szucs
 */
public class Nyilas extends Katona{
    private int lőtáv;

    public Nyilas(int lőtáv,int támadó_erő, int védő_erő) {
        super(támadó_erő, védő_erő);
        this.lőtáv=lőtáv;
    }

    public int getLőtáv() {
        return lőtáv;
    }

    public void setLőtáv(int lőtáv) {
        this.lőtáv = lőtáv;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Nyilas))
            return false;
        Nyilas n=(Nyilas)obj;
        return this.getLőtáv()==n.getLőtáv() && this.getTámadó_erő()==n.getTámadó_erő()
                && this.getVédő_erő()==n.getVédő_erő();
    }
    
    
   

    @Override
    public String toString() {
        return "NYilas: TE :=" + super.getTámadó_erő() + "VE:" + super.getVédő_erő() + " " + lőtáv;
    }

    

    
    
    
    
}
