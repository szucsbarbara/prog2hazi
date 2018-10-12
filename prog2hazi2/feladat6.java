/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szucs
 */
public class feladat6 {
    public static void main(String[] args) {
        int [] tomb = {1,2,2,3,4,5,5,3,5,1};
      
        System.out.println(isConsecutiveFour(tomb));
    }
    
    public static boolean isConsecutiveFour(int[] values){
        if(values.length>4)
        {
            for(int i=3;i<values.length;i++)
            
                if(values[i]==values[i-1] && values[i-1]==values[i-2] && values[i-2]==values[i-3])
                    return true;
            return false;
         
        }
        else
            return false;
    }
    
    
}
