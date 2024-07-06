package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class KoneksiDatabase {
    public static Connection BukaKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/projek_uas", "root", "");
            return cn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
