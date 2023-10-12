package Pertemuan_1;
import java.util.Scanner;
public class Array {
public static void main(String[] args) {
        String[] Hari = {"Senin","Selasa","Rabu","Kamis","Jum'at"};

   System.out.println("Mengakses Data Array:");
   System.out.println("Hari ke 1: " + Hari[0]);
   System.out.println("Hari ke 2: " + Hari[1]);
   System.out.println("Hari ke 3: " + Hari[2]);
   System.out.println("Hari ke 4: " + Hari[3]);
   System.out.println("Hari ke 5: " + Hari[4]);
   
    Scanner input=new Scanner(System.in);
   
        System.out.print("Masukan Jumlah Kata : ");
        int n=input.nextInt();
        
        //Deklarasi array
        String kata[]=new String[n];
      
        //Input data ke array
        for(int i=0;i<kata.length;i++)
        {
           System.out.print("Kata ke "+(i+1)+" : ");
           kata [i]=input.next();
        }
        //Menampilkan data dalam array
        System.out.println("Kata-kata yang dimasukan");
        for(int i=0;i<kata.length;i++)
        {
          System.out.println(kata[i]);
        }
    }
    
}
