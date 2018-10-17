/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katonák;

/**
 *
 * @author szucs
 */
public class Test {
    public static void main(String[] args) {
        Landzsas L= new Landzsas(12, 100);
        Nyilas Ny= new Nyilas(12, 11, 34);
        Nyilas Ny2=new Nyilas(23, 33, 21);
        Landzsas L2=new Landzsas(23, 33);
        
         Katona tmp = Megkuzd(Ny2,Ny);
        System.out.println(tmp.toString());
   
        System.out.println(Megkuzd (tmp,L)); 
        
        
    }
 public static Katona Megkuzd(Katona a, Katona b){
           
           if(a.getTámadó_erő()>b.getVédő_erő())
                return a;
           
           else if(a.getVédő_erő()<b.getTámadó_erő())
                return b;
           
           return a;
           
       }
    
}

