package UTS_2255201030;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    SimpleLibrary SL = new SimpleLibrary();
    Perpusku P = new Perpusku();
    String pilih;
    Scanner masuk = new Scanner (System.in);
while(true){
    System.out.println("=============== SELAMAT DATANG ===============");
    System.out.println("------ Di aplikasi sistem perpustakaan ------");
    System.out.println("Aplikasi yang tersedia :");
    System.out.println("[1] Simple Library");
    System.out.println("[2] Perpusku");
    System.out.println("[3] Keluar");
    System.out.print("pilih aplikasi : ");
    pilih = masuk.nextLine();
    
    if(pilih.equals("1")){
    SL.GetUsername();
    SL.GetPassword();
    System.out.println("\nMenu");
    System.out.println("[1] Tambah buku baru" );
    System.out.println("[2] Lihat daftar buku");
    System.out.println("[3] Pinjam buku");
    System.out.println("[4] Kembalikan buku");
    System.out.println("[5] Cari buku");
    System.out.println("[6] Keluar");
    System.out.print("Pilih menu : ");
    int pil = masuk.nextInt();
        switch(pil){
            case 1:
                SL.TambahBuku();
                break;
            case 2:
                SL.LihatDaftarBuku();
                break;
            case 3:
                SL.PinjamBuku();
                break;
            case 4:
                SL.KembalikanBuku();
                break;
            case 5:
                SL.cari();
                break;
            case 6:
                SL.Keluar();
                break;
            default:
                System.out.println("Pilihan tidak valid !");
        }
    }else 
    if(pilih.equals("2")){
    System.out.println("\nMenu");
    System.out.println("[1] Buat Kartu Anggota Perpustakaan");
    System.out.println("[2] Tambah buku baru" );
    System.out.println("[3] Lihat daftar buku");
    System.out.println("[4] Pinjam buku");
    System.out.println("[5] Kembalikan buku");
    System.out.println("[6] Cari buku");
    System.out.println("[7] Keluar");
    System.out.print("Pilih menu : ");
    int pil = masuk.nextInt();
        switch(pil){
            case 1:
                P.KAP();
                break;
            case 2:
                P.TambahBuku();
                break;
            case 3:
                P.LihatDaftarBuku();
                break;
            case 4:
                P.PinjamBuku();
                break;
            case 5:
                P.KembalikanBuku();
                break;
            case 6:
                P.cari();
                break;
            case 7:
                P.Keluar();
                break;
            default:
                System.out.println("Pilihan tidak valid !");
        }
    }else
    if(pilih.equals("3")){
            System.exit(0);
        }else{
        System.out.println("Pilihan tidak valid!");
    }
 }
}
}


 

