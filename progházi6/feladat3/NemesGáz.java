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
public abstract class NemesGáz extends KemiaiElem {

    public NemesGáz(String vegyjel, int rendszám, int főcsoport) throws KémiaiException{
        super(vegyjel, rendszám, főcsoport);
        
        if(this.getFőcsoport()!=8)
            throw new KémiaiException("A főcsoportszám nem egyenlő 8-cal!");
            
    }
    
    @Override
    public boolean ReakciobaLephet(){
            return false;
    }
    
    @Override
    public boolean ReakciobaLephet(ReakcióKépes obj){
            return false;
    }
    
    
}
