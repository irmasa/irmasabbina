package Pertemuan_2;
public class mobil {
static MasterMobil avanza = new MasterMobil();

public static void main(String[] args) {
     System.out.println("Ini adalah mobil Avanza");
     System.out.println("Warna Avanza : " + avanza.warnaMobil);
     System.out.println("Merk Avanza : " + avanza.merkMobil);
     System.out.println("Tahun Penerbitan : " + avanza.tahunMobil);
     
     avanza.berjalan();
     avanza.berhenti();
    }
    
}
