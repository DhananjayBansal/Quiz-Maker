/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;
/**
 * @author Admin
 * 
 */
import java.util.Date;
import  java.time.LocalDate;
import java.util.Scanner;
 import java.math.*;
import java.time.format.DateTimeFormatter;
class box{
    
int length;
}
public class Java1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         /*  box b1=new box();
           b1.length=5;
           
           System.out.print(b1.length);
           box b2=b1;
           b2.length=6;
           b1.length+=2;
           System.out.print(b1.length);
          b1.length=new int[10];
          for(int i=0;i<10;i++) 
          { b1.length[i]=i;
          System.out.print(b1.length[i]+" ");
          }*/
    
   /*        Scanner sc=new Scanner(System.in);
           
          
           String s1="548500054545454545458454854584548545445445";
           String s2="6545654645458474854584545454545454";
           String s3;s3=sc.nextLine();
           BigInteger b1=new BigInteger(s1);
           BigInteger b2=new BigInteger(s3);
           BigInteger b3=b1.add(b2);
           System.out.println(b3);
           
           BigInteger b4=new BigInteger("1");
           for(int i=1;i<=100;i++)
               b4=b4.multiply(BigInteger.valueOf(i));
           System.out.println(b4);
           Integer a=new Integer(7);
           String s6=a.toString();
           s6=s6+"7";
           System.out.println(s6);*/


	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	LocalDate localDate = LocalDate.now();
	
        String str=dtf.format(localDate);
        System.out.println(str);//2016/11/16
}}
