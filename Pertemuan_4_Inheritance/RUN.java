package Pertemuan_4_Inheritance;
public class RUN {
public static void main(String[] args) {
        Enemy_IBU E = new Enemy_IBU();
        E.name();
        E.hp();
        E.attackpoint();
        E.attack();
        
        Zombie Z = new Zombie();
        Z.name();
        Z.hp();
        Z.attackpoint();
        Z.walk();
        Z.attack();
        
        Potit P = new Potit();
        P.name();
        P.hp();
        P.attackpoint();
        P.jump();
        
        Burung B = new Burung();
        B.name();
        B.hp();
        B.attackpoint();
        B.walk();
        B.jump();
        B.fly();
        
        
     
    }
    
}
