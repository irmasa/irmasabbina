package Pertemuan_1;
import java.util.Scanner;
public class Percabangan {
public static void main(String[] args) {
       Scanner masuk = new Scanner (System.in);
       int nilai;
       
        System.out.println("Nilai = ");
        nilai = masuk.nextInt();
     
        if(nilai>=80)
            System.out.println("Predikat A");
        else if(nilai>=69)
            System.out.println("Predikat B");
        else if(nilai>=56)
            System.out.println("Predikat C");
        else if(nilai>=40)
            System.out.println("Predikat D");
        else
            System.out.println("Predikat E");
    }
    
}
