/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szucs
 */
import java.util.Random; 
import java.util.Scanner;



public class kopapirollo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         Random rnd = new Random();
         String szavak;
         
         szavak=sc.nextLine();
         while(szavak.compareTo("vege")!=0)
         {
             int rand=rnd.nextInt(3);
             switch(szavak)
             {
                 case "ko":
                     if(rand==0)
                         System.out.println("döntetlen");
                     else if(rand==1)
                         System.out.println("vesztettél");
                     else
                         System.out.println("győztél");
                     break;
             
                 case "papir":
                       if(rand==0)
                           System.out.println("győztem");
                       else if(rand==1)
                           System.out.println("döntetlen");
                       else
                           System.out.println("Vesztettél");
                       break;
                       
                 case "ollo":
                     if(rand==0)
                         System.out.println("vesztettél");
                     else if(rand==1)
                         System.out.println("győztél");
                     else
                         System.out.println("vesztettél");  
                     break;
                    
                 }
             szavak=sc.nextLine();
             }
         }
         
   
    
}
