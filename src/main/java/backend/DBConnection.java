/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author arash
 */
public class DBConnection {
   static  Connection con;
    static {
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal","root","44@@");
            Class.forName("com.mysql.cj.jdbc.Driver");
<<<<<<< HEAD
             con=DriverManager.getConnection("mysql://root:dRtSzHvDsuQLkrHRXRDRbQwnCZgPQHMK@mysql.railway.internal:3306/railway","root","dRtSzHvDsuQLkrHRXRDRbQwnCZgPQHMK");
=======
             con=DriverManager.getConnection("jdbc:mysql://containers-us-west-XX.railway.app:6543/jobportal","root","44@@");
>>>>>>> 525e107e60b3f84d5d047a63b9a253591a19e066
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
    public  static  Connection getConnect(){
        return con;
    }
    
}
