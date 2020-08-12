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
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        rect obj=new rect();
        System.out.println(obj);
        obj.getlength();
        obj.getwidth();
        System.out.println("length="+obj.setlength(4));
        System.out.println("width="+obj.setwidth(2));
        System.out.println("area="+obj.getarea());
        System.out.println("perimeter="+obj.getperi());
        System.out.println(obj);
    }
    
}
class rect
{
    float length=1.0f;
    float width=1.0f;
    float l1;
    double area;
    double perimeter;
    void rec(float l,float w)
    {
        length=1;
        width=w;
    }
    float getlength()
    {
        return length;
    }
    float setlength(float l1)
    {
        length=l1;
        return length;
    }
    float getwidth()
    {
        return width;
    }
    float setwidth(float w1)
    {
        width=w1;
        return width;
    }
    double getarea()
    {
        area=(width*length);
        return area;
    }
    double getperi()
    {
        perimeter=2*(length+width);
        return perimeter;
    }
    
    public String toString()
    {
        return ("length"+length+"\nwidth"+width);
    }
}
    
    

