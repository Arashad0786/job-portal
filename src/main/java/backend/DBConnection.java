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
    static Connection con=null;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Use Environment Variables for security and flexibility (Render compatible)
            String url = System.getenv("DB_URL");
            String user = System.getenv("DB_USER");
            String password = System.getenv("DB_PASSWORD");

            // Fallbacks for local development or if Env Vars are missing
            if (url == null || url.isEmpty()) {
                // FIXED: Removed extra quotes and placeholders. You must replace HOST:PORT with
                // actual values or set DB_URL env var.
                // Assuming localhost for fallback if not specified.
//                url = "jdbc:mysql://localhost:3306/sql8814115?useSSL=false&allowPublicKeyRetrieval=true";
                    url="jdbc:mysql://localhost:3306/jobportal";
            }
            if (user == null || user.isEmpty()) {
//                user = "sql8814115";
                  user="root";
            }
            if (password == null || password.isEmpty()) {
//                password = "W2gkN9LJN6";
                  password="44@@";
            }

            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnect() {
        return con;
    }
}
