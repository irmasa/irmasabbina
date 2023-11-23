package Tugas_Pertemuan_8;
public class Main {
public static void main(String[] args) {
      Kamera K = new Kamera();
      Kamera_Bawaan_Hp KBH = new Kamera_Bawaan_Hp();
      Kamera_IG KI = new Kamera_IG();
      
      System.out.println("Kegunaan Kamera : ");
      K.Foto();
      K.Vidio();
      
      System.out.println("\nKelebihan dari kamera bawaan Hp : ");
      KBH.Foto();
      KBH.Vidio();
      
      System.out.println("\nKelebihan dari kamera IG : ");
      KI.Foto();
      KI.Vidio();
      
    }
    
}
