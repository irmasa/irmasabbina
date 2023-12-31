package Tugas_Pertemuan_11_GUI;
import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import javax.swing.JOptionPane;

public class Koneksi {
    Connection con=null;
    String statusKoneksi = null;
    public void koneksi()
    {
        try
        {
            String connectionURL = "jdbc:mysql://localhost:3306/dbbuku_tamu";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
           //JOptionPane.showMessageDialog(null, "Sukses Koneksi");
           statusKoneksi = "Berhasil";
        }

        catch(Exception e)
        {
        //JOptionPane.showMessageDialog(null, e);
            statusKoneksi = "Gagal";
       // System.exit(0);
        
        }
}
    public static void main(String[] args) {
        Koneksi koneksi = new Koneksi();
        koneksi.koneksi();
    }
    }