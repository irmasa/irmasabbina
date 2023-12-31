package Tugas_Pertemuan_11_GUI;
import Tugas_Pertemuan_11_GUI.Koneksi;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Insert {

    Koneksi konek = new Koneksi();
   

    public void insert(int Id_tamu,String Nama, String Pekerjaan, String Jenis_Kelamin, String Alamat) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql = "insert into daftar_tamu (Id_tamu, Nama, Pekerjaan, Jenis_Kelamin, Alamat)" + "values('" + Id_tamu + "','" + Nama + "','" + Pekerjaan + "','" + Jenis_Kelamin + "','" + Alamat + "')";
//              String sql = "insert into daftar_tamu values('"+ Id_tamu + "','" + Nama + "','" + Pekerjaan + "','" + Jenis_Kelamin + "','" + Alamat + "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {JOptionPane.showMessageDialog(null,ex);
        }
    }

}