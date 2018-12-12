/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kémia;

/**
 *
 * @author User
 */
public abstract class NemFém extends KemiaiElem{

    public NemFém(String vegyjel, int rendszám, int főcsoport) {
        super(vegyjel, rendszám, főcsoport);
    }
    
    @Override
    public boolean ReakciobaLephet(){
        if(((this.getFőcsoport()+super.getFőcsoport())%8)==0)
            return true;
        else
            return false;
    }
    
    @Override
    public boolean ReakciobaLephet(ReakcióKépes obj){
        if(((((NemFém)obj).getFőcsoport()+this.getFőcsoport())%8)==0)
            return true;
        else
            return false;
    }
    
}
