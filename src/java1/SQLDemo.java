/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.sql.*;
public class SQLDemo
{
PreparedStatement pst;
ResultSet rst;
ConnectionClass cobj;
SQLDemo()
{
cobj = new ConnectionClass();

}
public void display()
{
cobj.Connect();
try
{
pst = cobj.con.prepareStatement("Select * from tbProduct ");
rst= pst.executeQuery();
while(rst.next())
{
System.out.println();
System.out.println(rst.getString(1));
System.out.println(rst.getString(2));
System.out.println(rst.getString(3));
System.out.println(rst.getString(4));
System.out.println(rst.getString(5));

System.out.println();
}
rst.close();
}
catch(Exception ex)
{
System.out.println("Error in query"+ex);
}

cobj.DisConnect();
}
public static void main(String a[])
{
SQLDemo obj = new SQLDemo();
obj.display();
}
}