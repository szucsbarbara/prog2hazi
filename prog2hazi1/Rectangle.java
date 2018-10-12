/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szucs
 */
public class Rectangle {
    private double width;
    private double height;
    
    public Rectangle() {
        this.width=1.0;
        this.height=1.0;

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea()
    {
        return width*height;
        
    }
    public double getPreimeter()
    {
        return 2*(width+height);
    
    
    }

    @Override
    public String toString() {
        return "a teglalap szelessege\n"+this.width+"a teglalap hosszusaga="+this.height+"a teglalap kerülete=\n"+this.getPreimeter()+"ateglalap terulete=\n"+this.getArea();
    }
    


    
}


