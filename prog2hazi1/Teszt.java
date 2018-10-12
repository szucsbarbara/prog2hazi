/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szucs
 */
public class Teszt {
    public static void main(String[] args) {
        /*ReguralPolygon r1=new ReguralPolygon();
        ReguralPolygon r2=new ReguralPolygon(6,4);
        ReguralPolygon r3=new ReguralPolygon(10,4,5.6,7.8);
        System.out.println(r3.getArea());
        System.out.println(r2.toString());*/
        QuadraticEquation p1=new QuadraticEquation(12, 43, 10);
        QuadraticEquation p2=new QuadraticEquation(1.2, 132, 30);
        QuadraticEquation p3=new QuadraticEquation(52, 6, 80);
        if(p1.getDiscriminant()>0)
            System.out.println(p1.getRoot1()+" "+p1.getRoot2());
        else if(p1.getDiscriminant()==0)
            System.out.println(p1.getRoot1());
        else
            System.out.println("The equation has no roots");
        if(p2.getDiscriminant()>0)
            System.out.println(p2.getRoot1()+" "+p2.getRoot2());
        else if(p2.getDiscriminant()==0)
            System.out.println(p2.getRoot1());
        else
            System.out.println("The equation has no roots");
        if(p3.getDiscriminant()>0)
            System.out.println(p3.getRoot1()+" "+p3.getRoot2());
        else if(p3.getDiscriminant()==0)
            System.out.println(p3.getRoot1());
        else
            System.out.println("The equation has no roots");
        
        
                
                    
        
        
    }
    
}
