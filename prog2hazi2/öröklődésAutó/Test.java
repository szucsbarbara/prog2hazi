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
public class Test {
    public static void main(String[] args) {
        Teherautó[] tomb= new Teherautó[10];
        Autó[] tomb2= new Autó[10];
        
        
        tomb[0]=new Teherautó(2000,"ncjf123",1500);
        tomb[1]=new Teherautó(3000,"nhjf123",1550);
        tomb[2]=new Teherautó(5000,"nwjf123",1540);
        tomb[3]=new Teherautó(6000,"ntjf123",1520);
        tomb2[0]=new Autó("dsdf4",1233);
        tomb2[1]=new Autó("dsedf4",12433);
        tomb2[2]=new Autó("dsderf4",12353);
        tomb2[3]=new Autó("dsggggdf4",12633);
        rendezMaxSzállíthatóTeherCsökkenőleg(tomb);
        for(int i=0;i<3;i++)
        {
            System.out.println(tomb[i]);
        }
        System.out.println("max:"+ keresMaxMotorTeljesítmény(tomb2));
        
    
        
        
        
        
    }
    
    static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher){
        Teherautó tmp;
        for(int i=0;i<2;i++)
        {
            for(int j=i+1;j<3;j++)
                if(teher[i].getMaxSzallithatóTeher()<teher[j].getMaxSzallithatóTeher())
                   
                {
                    tmp=teher[i];
                    teher[i]=teher[j];
                }
                    
        }
            
        
    }
    
    static Autó keresMaxMotorTeljesítmény(Autó [] autó)
    {
        Autó max=autó[0];
        for(int i=1;i<3;i++)
        {
            if(max.getMotorTeljesítmény()<autó[i].getMotorTeljesítmény())
                max=autó[i];
            
        }
      return max;
      
    }
}
