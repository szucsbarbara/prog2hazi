/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.newpackage;

/**
 *
 * @author szucs
 */
public class AngolMagyarSzótár {
    private String angol_szó;
    private String magyar_szó;

    public AngolMagyarSzótár(String angol_szó, String magyar_szó) {
        this.angol_szó = angol_szó;
        this.magyar_szó = magyar_szó;
    }

    public String getAngol_szó() {
        return angol_szó;
    }

    public void setAngol_szó(String angol_szó) {
        this.angol_szó = angol_szó;
    }

    public String getMagyar_szó() {
        return magyar_szó;
    }

    public void setMagyar_szó(String magyar_szó) {
        this.magyar_szó = magyar_szó;
    }

    @Override
    public String toString() {
        return "AngolMagyarSz\u00f3t\u00e1r{" + "angol_sz\u00f3=" + angol_szó + ":" + ", magyar_sz\u00f3=" + magyar_szó + '}';
    }
    
    
    
    
}
