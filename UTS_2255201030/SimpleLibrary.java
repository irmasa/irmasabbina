package UTS_2255201030;
import java.util.Scanner;
public class SimpleLibrary extends Library{
Scanner masuk = new Scanner (System.in);
String[][] daftarBuku = new String[10][3];
int jumlahBuku = 0;
boolean isRunning;
    
    public void Masuk() {
       isRunning = true;
       Library user = new Library();
       user.SetUsername(" ");
       user.SetPassword(" ");
       
       System.out.print("Username : " + user.GetUsername());
       String nama = masuk.nextLine();
       System.out.print("Password : " + user.GetPassword());
       String pwd = masuk.nextLine();
       System.out.println("----- SELMAT DATANG DI SIMPLE LIBRARY -----");
    }

    @Override
    public void TambahBuku() {
        System.out.println("Masukkan judul buku : ");
        String judul = masuk.nextLine();
        System.out.println("Masukkan pengarang buku :");
        String pengarang = masuk.nextLine();
        
        daftarBuku[jumlahBuku][0]= judul;
        daftarBuku[jumlahBuku][1]= pengarang;
        
    jumlahBuku ++;
        System.out.println("Buku berhasil di tambahkan !");
    }

    @Override
    public void LihatDaftarBuku() {
    if(jumlahBuku == 0){
        System.out.println("Belum ada buku yang terdaftar !");
        }else{
        System.out.println("Daftar buku : ");
        for(int i = 0; i < jumlahBuku; i++){
            System.out.println((i+1) + ". " + daftarBuku[i][0] + "|" + daftarBuku[i][1] );
            }
        } 
    }

    @Override
    public void PinjamBuku() {
        System.out.println("Masukkan kode buku yang ingin di pinjam : ");
        int kodeBuku = masuk.nextInt();
        masuk.nextInt();
        
        if(kodeBuku > 0 && kodeBuku <= jumlahBuku){
            System.out.println("Masukkan nama peminjam : ");
            String nama = masuk.nextLine();
            System.out.println("Buku berhasil dipinjam oleh : " + nama + "|");
        }else{
            System.out.println("Kode buku tidak valid !");
        }   
    }

    @Override
    public void KembalikanBuku() {
        System.out.print("Masukkan kode buku yang ingin di kembalikan : ");
        int kodeBuku = masuk.nextInt();
        masuk.nextLine();
        
        if(kodeBuku > 0 && kodeBuku <= jumlahBuku){
            System.out.println("Buku berhasil dikembalikan");
        }else{
            System.out.println("Kode buku tidak valid !");
        }   
    }

     @Override
    public void cari() {
         System.out.print("Masukkan judul buku yang ingin dicari : ");
         String judul = masuk.nextLine();
         
         for(int i = 0; i < jumlahBuku; i++){
             if(daftarBuku[i][0].equalsIgnoreCase(judul)){
                 System.out.println((i+1) + ". " + daftarBuku[i][0] + "|" + daftarBuku[i][1]);
                 return;
             }
        }
         System.out.println("Buku tidak ditemukan !");
    }

    @Override
    public void Keluar() {
        System.out.println("Terimakasih telah menggunakan layanan Simple Library :)");
        isRunning = false;
    }

   
}


   