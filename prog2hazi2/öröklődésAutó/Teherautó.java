/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package öröklődésAutó;

/**
 *
 * @author szucs
 */
public class Teherautó extends Autó{
    private int maxSzallithatóTeher;

    public Teherautó(int maxSzallithatóTeher, String rendszám, int motorTeljesítmény) {
        super(rendszám, motorTeljesítmény);
        this.maxSzallithatóTeher = maxSzallithatóTeher;
    }

    public int getMaxSzallithatóTeher() {
        return maxSzallithatóTeher;
    }

    @Override
    public String toString() {
        return "Teheraut\u00f3{" + "maxSzallithat\u00f3Teher=" + maxSzallithatóTeher + '}';
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teherautó other = (Teherautó) obj;
        if (this.maxSzallithatóTeher != other.maxSzallithatóTeher) {
            return false;
        }
        return true;
    }
    
    
    
}
