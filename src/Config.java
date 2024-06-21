/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Config {
    private static Connection  mysql;
    public static Connection configDB()throws SQLException{
     try {
        String url = "jdbc:mysql://localhost:3306/projectakhhirpbo";
        String user = "root";
        String pass = ""; 
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        mysql = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal");
        }
        return mysql;
        
   
   }
}

    




