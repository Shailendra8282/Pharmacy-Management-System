
package dao;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Admin
 */
public class ConnectionProvider
{
 public static Connection getcon()
         {
             try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy?useSSL=false","root","root");
                 return con;
                }
             catch(Exception e)
                     {
                     System.out.println(e);
                     return null;
                     }
    
         }
         
    
}
