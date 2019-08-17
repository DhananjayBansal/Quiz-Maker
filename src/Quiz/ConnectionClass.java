/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**import ja
 *
 * @author Admin
 */
import java1.*;
import java.sql.*;
public class ConnectionClass {
    
public Connection con;
public void Connect()
{
try
{
//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//con = DriverManager.getConnection("jdbc:odbc:weekenddsn");
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=dbQuiz;integratedSecurity=true;");
System.out.print("Connected");
}
catch(Exception ex)
{
System.out.print("Error in Connection"+ex);
}
}
public void DisConnect()
{
try
{
con.close();
System.out.print("DisConnected");
}
catch(Exception ex)
{
System.out.print("Error in DisConnection");
}
}
public static void main(String a[])
{
ConnectionClass cobj= new ConnectionClass();
cobj.Connect();
cobj.DisConnect();
}
}
