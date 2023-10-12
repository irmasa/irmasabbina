package Pertemuan_2;
public class game {
    public static void main(String[] args) {
       Player petani = new Player();
       
       
       petani.name = "Petani Icha";
       petani.speed = 78;
       petani.healthpoint = 0;
       
       
       petani.run();
       
       if(petani.IsDead()){
           System.out.println("Game Over");
    }
    } 
}
