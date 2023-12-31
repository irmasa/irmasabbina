package Tugas_Pertemuan_11_GUI;

import Tugas_Pertemuan_11_GUI.Koneksi;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Delete {
Koneksi konek = new Koneksi();
   

    public void delete(int Id_tamu) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
        
              String sql = "delete from daftar_tamu where Id_tamu ='" + Id_tamu + "'"; 
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {JOptionPane.showMessageDialog(null,ex);
        }
    }
}
