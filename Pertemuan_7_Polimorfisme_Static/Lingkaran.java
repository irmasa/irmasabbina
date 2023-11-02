package Pertemuan_7_Polimorfisme_Static;
public class Lingkaran {
    float luas(float jarijari){
        return (float) (Math.PI * jarijari * jarijari);
    }
    double luas(double diameter){
        return (Math.PI * diameter * 1/4);
    }
    public static void main(String[] args) {
        Lingkaran L =new Lingkaran();
        float jari2 = 14;
        double d = 7;
        
        System.out.println("Menghitung luas lingkaran menggunakan Jari-jari : " + L.luas(jari2));
        System.out.println("Menghitung luas lingkaran menggunakan Diameter : " + L.luas(d));
    }
}
