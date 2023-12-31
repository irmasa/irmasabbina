package Tugas_Pertemuan_11_GUI;

import java.sql.Statement;
import javax.swing.JOptionPane;

public class Update {
Koneksi konek = new Koneksi();
   

    public void update(int Id_tamu, String Nama, String Pekerjaan, String Jenis_Kelamin, String Alamat) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql_ID = "update daftar_tamu set Id_tamu='"+Id_tamu+"'where Id_tamu='"+Id_tamu+"'";
            String sql_Nama = "update daftar_tamu set Nama='"+Nama+"'where Id_tamu='"+Id_tamu+"'";
            String sql_Pekerjaan = "update daftar_tamu set Pekerjaan='"+Pekerjaan+"'where Id_tamu='"+Id_tamu+"'";
            String sql_Jenis_Kelamin = "update daftar_tamu set Jenis_Kelamin='"+Jenis_Kelamin+"'where Id_tamu='"+Id_tamu+"'";
            String sql_Alamat = "update daftar_tamu set Alamat='"+Alamat+"'where Id_tamu='"+Id_tamu+"'";
            
            statement.executeUpdate(sql_ID);
            statement.executeUpdate(sql_Nama);
            statement.executeUpdate(sql_Pekerjaan);
            statement.executeUpdate(sql_Jenis_Kelamin);
            statement.executeUpdate(sql_Alamat);
            
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {JOptionPane.showMessageDialog(null,ex);
        }
    }
    
}
