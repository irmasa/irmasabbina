package Pertemuan_4_Inheritance;
public class Zombie extends Enemy_IBU {
    @Override
    void name(){
        System.out.println("Nama : Zombie");
    }
    void walk(){
        System.out.println("Zombie Jalan-jalan");
    } 
    void attack (){
        System.out.println("gigit\n");
    }
}
