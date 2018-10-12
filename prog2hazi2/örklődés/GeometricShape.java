/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package örklődés;

import java.util.Date;

/**
 *
 * @author szucs
 */
public class GeometricShape {
    private String color;
    private boolean filed;
    private Date dateCreated;

    public GeometricShape() {
        this.color="white";
        this.filed=false;
        this.dateCreated=new Date();
    }

    public GeometricShape(String color, boolean filed) {
        this.color = color;
        this.filed = filed;
        this.dateCreated=new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiled() {
        return filed;
    }

    public void setFiled(boolean filed) {
        this.filed = filed;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on "+ dateCreated + "color: "+color+" and filled: " +filed;
    }
    
    
    
}
