/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex2;

/**
 *
 * @author asus
 */
public class com {
    public static void main(String[] arg){
     int a=10,b=9,c=5,d=6;
        System.out.println("complex number 1:"+a+"+i"+b);
        System.out.println("complex number 2:"+c+"+i"+d);
        complex obj1=new complex();
        obj1.add(a,b,c,d);
        obj1.sub(a,b,c,d);
        obj1.mul(a,b,c,d);
        obj1.div(a,b,c,d);
        
    }
}
    

class complex
{
    int i,j;
    void add(int w,int x,int y,int z)
    {
       i=w+y;
       j=x+z;
       System.out.println("addition:"+i+"+i"+j);
    }
    void sub(int w,int x,int y,int z)
    {
        i=w-y;
        j=x-z;
        System.out.println("subtraction:"+i+"-i"+j);
    }
    void mul(int w,int x,int y,int z)
    {
        i=w*y;
        j=x*z;
        System.out.println("multiplication:"+i+"*i"+j);
    }
    void div(int w,int x,int y,int z)
    {
        i=w/y;
        j=x/z;
        System.out.println("division:"+i+"/i"+j);
    }
    
}