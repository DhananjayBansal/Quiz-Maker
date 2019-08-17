/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

/**
 *
 * @author Admin
 */
public class test {
    static int i=2;
    public static void main(String arg[])
    {
        System.out.println(i+"kl");
        foo(i);
        System.out.println(i+"kl");
    }
    public static void foo(int i)
    {
        i=i+2;
    }
}
