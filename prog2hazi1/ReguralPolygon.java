/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szucs
 */
public class ReguralPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public ReguralPolygon() {
        this.n=3;
        this.side=1;
        this.x=0;
        this.y=0;
        
    }

    public ReguralPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x=0;
        this.y=0;
        
    }

    public ReguralPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getPreimeter(){
        return side*n;
    
    }
    public double getArea(){
        return 0.25*n*Math.pow(side, 2)*1/(Math.tan(Math.PI/n));
        
    
    }

    @Override
    public String toString() {
        return "oldalak szama"+this.n+"oldalak hossza"+this.side+"a sokszog kerülete"+this.getPreimeter()+"sokszög területe"+this.getArea();
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
