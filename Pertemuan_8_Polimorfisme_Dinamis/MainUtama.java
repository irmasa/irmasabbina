package Pertemuan_8_Polimorfisme_Dinamis;
public class MainUtama {
public static void main(String[] args) {
       BangunDatar BD = new BangunDatar();
       Persegi P = new Persegi (5);
       Segitiga S = new Segitiga (5,10);
       Lingkaran L = new Lingkaran (10);
       
       //Memanggil method luas dan keliling
       
       BD.luas();
       BD.keliling();
       
       System.out.println("Luas Persegi : " + P.luas());
       System.out.println("Keliling Persegi : " + P.keliling());
       
       System.out.println("Luas Segitiga : " + S.luas());
       
       System.out.println("Luas Lingkaran : " + L.luas());
       System.out.println("Keliling Lingkaran : " + L.keliling());
    }
    
}
