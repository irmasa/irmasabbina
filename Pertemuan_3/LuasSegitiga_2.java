package Pertemuan_3;
public class LuasSegitiga_2 {
    int a = 14;
    int t = 10;
    
    double hitungluassegitiga(){
      double luas =(a*t)/2;
        System.out.println("Alas = " + a );
        System.out.println("Tinggi = " + t); 
        return luas;
    }
public static void main(String[] args) {
       LuasSegitiga_2 SG2 =new LuasSegitiga_2 ();
       System.out.println("Luas Segitiga = " + SG2.hitungluassegitiga());
    }
    
}
