/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posta;

import java.util.Objects;

/**
 *
 * @author szucs
 */
public class PostaiKüldemény implements Comparable<PostaiKüldemény>{
    
    private String címzett_neve;
    
    private String telepules;
    private String utca;
    private int hazszam;
    private int csomag_értéke;

    public PostaiKüldemény(String címzett_neve, String telepules, String utca, int hazszam, int csomag_értéke) {
        this.címzett_neve = címzett_neve;
        
        this.telepules = telepules;
        this.utca = utca;
        this.hazszam = hazszam;
        this.csomag_értéke = csomag_értéke;
    }

    public String getCímzett_neve() {
        return címzett_neve;
    }

    public void setCímzett_neve(String címzett_neve) {
        this.címzett_neve = címzett_neve;
    }

    

    

    public String getTelepules() {
        return telepules;
    }

    public void setTelepules(String telepules) {
        this.telepules = telepules;
    }

    public String getUtca() {
        return utca;
    }

    public void setUtca(String utca) {
        this.utca = utca;
    }

    public int getHazszam() {
        return hazszam;
    }

    public void setHazszam(int hazszam) {
        this.hazszam = hazszam;
    }

    public int getCsomag_értéke() {
        return csomag_értéke;
    }

    public void setCsomag_értéke(int csomag_értéke) {
        this.csomag_értéke = csomag_értéke;
    }

    @Override
    public String toString() {
        return "PostaiK\u00fcldem\u00e9ny{" + "c\u00edmzett_neve=" + címzett_neve + ", ir\u00e1nyitoszam="  + ", telepules=" + telepules + ", utca=" + utca + ", hazszam=" + hazszam + ", csomag_\u00e9rt\u00e9ke=" + csomag_értéke + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    
    public int compareTo (PostaiKüldemény o)
    {
            if(this.telepules.compareTo(o.getTelepules())==0)
            {
                if(this.utca.compareTo(o.getUtca())==0)
                {
                    if(Integer.compare(hazszam, o.getHazszam())==0)
                    {
                        if(this.címzett_neve.compareTo(o.getCímzett_neve())==0)
                        {
                           
                                return (-1)*Integer.compare(csomag_értéke, o.getCsomag_értéke());
                        }
                        else
                            return this.címzett_neve.compareTo(o.getCímzett_neve());
                        
                    }
                    
                    else
                          return Integer.compare(hazszam, o.getHazszam());
                       
                }
                else
                     return this.utca.compareTo(o.getUtca());
                
            }
            else
                return this.telepules.compareTo(o.getTelepules());
                
    }

    

    
    
    
    
    
    
    
}
