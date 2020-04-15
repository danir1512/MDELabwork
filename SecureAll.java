/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secureall;
import java.sql.*;

/**
 *
 * @author João
 */

public class SecureAll {
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:32118:xe";
        //String url = "jdbc:oracle:thin:@localhost:32118:xe";
        Connection conn = DriverManager.getConnection(url,"mde","mde");
        //conn.setAutoCommit(false);

        UserInteraction userInteraction = new UserInteraction(conn);
        userInteraction.setSize(420, 325);
        userInteraction.setVisible(true);    
        
    }
}
