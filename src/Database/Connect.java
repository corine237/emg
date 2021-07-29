/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Corine
 */
public class Connect {

    String url = "jdbc:mysql://localhost:3306/gestion_panneaux";
    Connection con = null;
    ResultSet rs ;
//    PreparedStatement ps = null;
    Statement stm;
    
    public static Connection ConnectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_panneaux", "root", "");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public int FindUser(String user, String pass) {
        int re = 0;
        try {
            stm = con.createStatement();
            String sql = "select * from user where id_user=1";
            rs = (ResultSet) stm.executeQuery(sql);
            while (rs.next()) {

                if (rs.getString("username").equals(user) && rs.getString("password").equals(pass)) {
                    re = 1;
                } else {
                    re = 0;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex + " error in recuperitaion");
        }

        return re;
    }
  
    public void UpdatUser(String s, String ss) {

        try {
            String sql = "Update user set username='" + s + "',password='" + ss + "'"
                    + "where id_user= 1";

            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public String showDate() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(" YYYY-MM-dd");
        return sdf.format(d);

    }

    public String showDateTime() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        return sdf.format(d);

    }
  
}
