package Tugas_Pertemuan_6;

public class MainUser {
public static void main(String[] args) {
      User U = new User();
      U.Setnim(1030);
      U.Setnama("IRMA AFIFATUS SABBINA");
      U.Setipk(4);
      
      System.out.println("NIM\t: " + U.Getnim());
      System.out.println("NAMA\t: " + U.Getnama());
      System.out.println("IPK\t: " + U.Getipk());
    }
    
}
