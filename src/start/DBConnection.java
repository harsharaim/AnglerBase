/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package start;

/**
 *
 * @author Harsha Kumar
 */
//------------------------------error---------------------------------
// 
  import java.sql.*;  
public class DBConnection{  
public static Connection getCon(String jdbcmysqllocalhost3306miniproject, String root, String Password){ 
    Connection con=null;
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","YourPassword");  
return con;

}catch(Exception e){ 
  System.out.println(e.getMessage());
}
return con;
}  
 
public static Connection getConnection(){ 
    Connection con=null;
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","YourPassword");  
return con;

}catch(Exception e){ 
  System.out.println(e.getMessage());
}
return con;
}  
} 


