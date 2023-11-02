package Tugas_Pertemuan_5;

import Pertemuan_4_Inheritance.*;

public class Persegi extends BangunDatar_IBU {
 float sisi ;
 
 @Override
 float luas(){
     float rumus = sisi*sisi;
     System.out.println("menampikan hasil luas Persegi");
     return 0;
 }
} 
