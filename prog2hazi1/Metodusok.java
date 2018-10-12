


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szucs
 */
public class Metodusok {
    public static void main(String[] args) {
        elsof(5, 2, 1);
        masodikf(12, -3, 2);
        harmadikf(23, 1, 99, 25);
        System.out.println(negyedikf(3, 4, 5));
        System.out.println(otodikf(1990, 2018));
        hatodikf(3);
        System.out.println(hetedikf(23, 4));
        System.out.println(nyolcadikf(1009));
        kilencedikf(11);
        System.out.println(tizedikf(321));
        System.out.println(tizenegyedikf(5));
        tizenkettedikf(45, 89, 3);
        System.out.println("\n"+tizenharmadikf(10));
        tizennegyedikf();
        
                
        
    }
    public static void elsof(int a, int b, int c){
        if(a<b && a<c)
        {
            if(b<c)
                System.out.println(a+","+b+","+c);
            else
                System.out.println(a+","+c+","+b);
                
        }
        else if(b<a && b<c)
        {
            if(a<c)
                System.out.println(b+","+a+","+c);
            else
                  System.out.println(b+","+c+","+a);
        }
        else if(c<a && c<b) 
        {
            if(a<b)
                System.out.println(c+","+a+","+b);
            else
                System.out.println(c+","+b+","+a);
            
        }
            
            
  
    }
    public static void masodikf(double a, double b, double c)
    {
        
            if(a<b && a<c)
            System.out.println("a legkisebb:"+a);
        else if(b<a && b<c)
            System.out.println("a legkisebb:"+b);
        else if(c<a && c<b)
            System.out.println("a legkisebb:"+c);
        
        
        if(Math.abs(a)>Math.abs(b) && Math.abs(a)>Math.abs(c))
            System.out.println("abszolut ertekenek maximuma:"+Math.abs(a));
        else if(Math.abs(b)>Math.abs(a) && Math.abs(b)>Math.abs(c))
            System.out.println("abszolut ertekenek maximuma:"+Math.abs(b));
        else if(Math.abs(c)>Math.abs(a) && Math.abs(c)>Math.abs(c))
            System.out.println("abszolut ertekenek maximuma:"+Math.abs(c));
        
        
    }
    public static void harmadikf(double a, double b, double c, double d)
    {
        System.out.println(a+", "+b+", "+c+", "+d);
        if(d>=0)
            System.out.println(a+", "+c+", "+b+", "+d);
        else
            System.out.println(a+", "+b+", "+d+", "+c);
            
    }
    public static boolean negyedikf(double a, double b, double c)
    {
        if(a+b>c && b+c>a && b+a>c)
            return true;
        else
            return false;
            
    }
    public static int otodikf(int a, int b)
    {
        int db=0;
        
        for(int i=a+1;i<b;i++)
        
            if((i%4==0 && i%100!=0) || i%400==0 )
                db++;
                
        return db;
    }
    
    public static void hatodikf(int a)
    {
        switch(a)
        {
            case 1:
                System.out.println("elégtelen");
                break;
            case 2:
                System.out.println("elégséges");
                break;
            case 3:
                System.out.println("közepes");
                break;
            case 4:
                System.out.println("jó");
                break;
            case 5:
                System.out.println("Kiváló");
                break;
        }
    }
    public static int hetedikf(int a, int b)
    {
        int hanyados=0;
        while(a>=b)
        {
            hanyados=hanyados+1;
            a=a-b;
            
        }
        return hanyados;
    }
    public static boolean nyolcadikf(int n)
    {
       int szamlalo=0;
       for(int i=1;i<=n;i++)
       {
           if(n%i==0)
               szamlalo++;
           
       }
       if(szamlalo==2)
           return true;
       else
           return false;
           
        
        
        
    }
    
    public static void kilencedikf(int n)
    {
        int a=0;
        int b=1;
        int c;
        
        if(n==1)
        
            System.out.println(+a);
        else if(n==2)
            System.out.println(+a+","+b);
            
        else
        {
            c=a+b;
            System.out.println(a+" "+b+" "+c);
            int k=3;
        while(k<n)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.println(+c);
            k=k+1;
            
            
        }
        }
           
        
        
    }
    
    public static int tizedikf(int n)
    {
        int ujszam=0;
        while(n!=0)
        {
            ujszam=ujszam*10+(n%10);
            n=n/10;
            
        }
        return ujszam;
        
    }
    
    public static long tizenegyedikf(int n)
           
    {
         int eredmeny=1;
        
        for(int i=1; i<=n;i++)
            eredmeny=eredmeny*i;
        
        return eredmeny;
            
            
        
    }
    
    public static void tizenkettedikf(int n1, int n2, int k)
    {
        for(int i=n1; i<=n2;i++)
            if(i%k==0)
                System.out.print(i+" ");
        
        
    }
    public static int tizenharmadikf(int n)
    {
        int a=0;
        int b=1;
        int c=a+b;
        
        if(n==0)
        
            return b;
        
        while(c<=n)
        {
            a=b;
            b=c;
            c=a+b;
             
        }
       return c;
        
        
    }
    public static void tizennegyedikf()
    {
        int szamlalo=0;
        int n;
        
        for(int i=1;i<=100;i++){
            n=i;
           while(n!=0)
           {
               szamlalo+=Math.pow((n%10), 3);
               n=n/10;
           }
           if(i==szamlalo)
        {
            System.out.println(szamlalo+" ");
            szamlalo=0;
        }
        }
           
        
     }

    
    
    
    
    
    
}
