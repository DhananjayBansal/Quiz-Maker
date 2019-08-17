/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;
/*class th{
     static int a=3;
    static int b;
    static void meth(int x)
    {
        System.out.print(x+" "+a+" "+b);
    }
    static{
        System.out.print("  strstr");
        b=a*4;
    }
}*/
class Box
{int length=9;
    /*double width;
    double height;
    double depth;
    Box(){}
Box(double p,double q,double r)
{
    width=p;height=q;depth=r;
}
Box(Box f)
{
    width=f.width;height=f.height;depth=f.depth;
}*/
void show(){
    System.out.print("hgj");
}
}
class abox extends Box
{int length=5;
    /*double weight;abox(){}
    abox(double w,double h,double d, double we)
    {
        super(w,h,d);
        this.weight=we;
    }*/
    void show(){
        
    System.out.print("subhgj");
}
}
public class demo {
   
    public static void main(String arg[])
    {System.out.print("dfd");
        
  int c;
    int _df;
    int _a45;
    int a_frt;
   Box a;
   Box e=new Box();
   a=e; System.out.println(a.length); 
   a.show();
  abox b=new abox();a=b;
   a.show();
        System.out.println(a.length); 
   //System.out.print(e.width+" "+e.height+" "+e.depth);
    }
}
