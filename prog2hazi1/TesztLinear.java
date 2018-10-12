/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szucs
 */
public class TesztLinear {
    public static void main(String[] args) {
        LinearEquation l1=new LinearEquation(1,2,3,4,5,6);
        LinearEquation l2=new LinearEquation(1.2,4,7,10.1,5,6.9);
        LinearEquation l3=new LinearEquation(11.2,22.1,9,4,23,87);
        if(l1.isSolvable())
            System.out.println(l1.getX()+ " " +l1.getY());
        else
            System.out.println("The equation has no solution");
        if(l2.isSolvable())
            System.out.println(l2.getX()+ " " +l2.getY());
        else
            System.out.println("The equation has no solution");
        if(l3.isSolvable())
            System.out.println(l3.getX()+ " " +l3.getY());
        else
            System.out.println("The equation has no solution");
    }
    
}
