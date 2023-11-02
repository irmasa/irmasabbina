package Pertemuan_4_Inheritance;
public class RUN {
public static void main(String[] args) {
        Enemy_IBU E = new Enemy_IBU();
        E.attack();
        Zombie Z = new Zombie();
        Z.walk();
        Z.attack();
        Potit P = new Potit();
        P.jump();
        Burung B = new Burung();
        B.walk();
        B.jump();
        B.fly();
        
        
     
    }
    
}
