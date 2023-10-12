package Pertemuan_3;
public class LuasSegitiga {
    int alas= 10;
    int tinggi= 12;
    
    void HitungLuasSegitiga(){
        int luas = (alas * tinggi)/2;
        System.out.println("Alas = " + alas);
        System.out.println("Tinggi = " + tinggi);
        System.out.println("Luas Segitiga = " + luas);
    }
public static void main(String[] args) {
        LuasSegitiga SG = new LuasSegitiga();
        SG.HitungLuasSegitiga();
    }
    
}
