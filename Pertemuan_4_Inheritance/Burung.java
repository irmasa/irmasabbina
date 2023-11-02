package Pertemuan_4_Inheritance;
public class Burung extends Enemy_IBU {
    @Override
    void name (){
        System.out.println("Nama : Burung");
    }
    void walk(){
        System.out.println("jalan-jalan");
    }
    void jump(){
        System.out.println("loncat-loncat");
    }
    void fly(){
        System.out.println("terbang");
    }   
}
