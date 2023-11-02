package Pertemuan_4_Inheritance;
public class Main {
public static void main(String[] args) {
    //Objek Bangun Datar
       BangunDatar_IBU BDI = new BangunDatar_IBU();
       
       Persegi P = new Persegi();
       P.sisi= 5;
       
       Lingkaran L =new Lingkaran();
       L.r= 22;
       
       Persegi_panjang PP = new Persegi_panjang();
       PP.lebar= 6;
       PP.panjang= 12;
       
       Segitiga S = new Segitiga();
       S.alas= 5;
       S.tinggi= 10;
       
       //Menunjukkan Inheritance
       BDI.luas();
       BDI.keliling();
       
       P.luas();
       P.keliling();
       
       L.luas();
       L.keliling();
       
       PP.luas();
       PP.keliling();
       
       S.luas();
       S.keliling();
    }
    
}
