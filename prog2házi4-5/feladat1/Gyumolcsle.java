/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat1;

/**
 *
 * @author szucs
 */
public abstract class Gyumolcsle extends Ital{

    public Gyumolcsle() {
    }
    
    abstract String mibolFacsartak();
    abstract String mibolKeszult();
    abstract String milyenizu();

    @Override
    public String toString() {
        return "Gyumolcsle{" + '}';
    }
    
    
    
}
