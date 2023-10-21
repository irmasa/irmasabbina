package Tugas_Pertemuan_4Dan5_pertama;
public class Gabungan {
public static void main(String[] args) {
    Keluarga K =new Keluarga();
    System.out.print("Nama Keluarga");
    K.jeneng();
    K.Penyayang();
        
        System.out.print("\nSEORANG AYAH");
        AYAH A = new AYAH();
        A.jeneng();//Menunjukkan Inheritance
        A.Penyayang();//Menunjukkan Inheritance
        A.Sifat_Ayah();
        A.Gen();
        
        System.out.print("\nSEORANG IBU");
        IBU ibu = new IBU();
        ibu.jeneng();//Menunjukkan Inheritance
        ibu.Penyayang();//Menunjukkan Inheritance
        ibu.Sifat_Ibu();
        ibu.Gen();
            
            System.out.print("\nANAK KE-1");
            Anak_ke_1 p = new Anak_ke_1();
            p.jeneng(); //Menunjukkan Inheritance
            p.Penyayang();//Menunjukkan Inheritance
            p.Sifat_Ibu();//Menunjukkan Inheritance
            p.Gen();
            p.Hobi_1();
            p.sifat_1();
           
            System.out.print("\nANAK KE-2");
            Anak_ke_2 n = new Anak_ke_2();
            n.jeneng(); //Menunjukkan Inheritance
            n.Penyayang();//Menunjukkan Inheritance
            n.Sifat_Ibu();//Menunjukkan Inheritance
            n.Gen();
            n.Hobi_2();
            n.sifat_2();

            System.out.print("\nANAK KE-3");
            Anak_ke_3 s = new Anak_ke_3();
            s.jeneng();//Menunjukkan Inheritance
            s.Penyayang();//Menunjukkan Inheritance
            s.Sifat_Ayah();//Menunjukkan Inheritance
            s.Gen();
            s.Hobi_3();
            s.sifat_3();
        
    }    
}
