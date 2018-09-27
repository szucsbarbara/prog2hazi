/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Hallgato {
    String nev;
    String nkód;
    int évfolyam;
    double átlag;

    public Hallgato(String nev, String nkód, int évfolyam) {
        this.nev = nev;
        this.nkód = nkód;
        this.évfolyam = évfolyam;
    }

    
    public void köszön1()
    {
        System.out.println("Jónapot Tanár Úr!");
        
        
    }
    
    public String getNév()
    {
        
        
        return this.nev;
    }
    
    public void köszön2(Hallgato h)
    {
        System.out.println("Szia"+" "+ h.getNév());
    }
    
}
