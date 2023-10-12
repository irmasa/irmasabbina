package Pertemuan_2;

public class Player {
    String name ;
    int speed;
    int healthpoint;
    
   void run(){
        System.out.println(name + " is running... ");
        System.out.println("Speed" + speed);
    }
    
    
    boolean IsDead(){
        if(healthpoint <= 0) return true;
    return false;
    }
    public static void main(String[] args){
}
}