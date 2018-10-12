
import java.util.Date;
import java.util.Objects;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szucs
 */
public class Ital {
   protected String név;
   protected String kiszerelés;
   private static int ár;
   protected Date gyártásiDátum;

 public Ital(){
    this.név="Coca Cola";
    this.kiszerelés="5 dl";
    this.ár=10;
   
}

    public Ital(String név, String kiszerelés,int ár, Date gyártásiDátum) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum = gyártásiDátum;
        this.ár=ár;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }
    public int getÁr()
    {
        return ár;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    @Override
    public String toString() {
        return név + ", " + kiszerelés + ", " + ár + " Ft";
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
        final Ital other = (Ital) obj;
        if(this.név.compareTo(other.név)!=0 || this.kiszerelés.compareTo(other.kiszerelés)!=0 || this.ár!=other.getÁr())
            return false;
            
        return true;
    }
    
    public int getÁreuróban()
    {
        return getÁr()/320;
        
    }
    
    

    
 
    
 
 

    
    
   
   
    
    
    
}
