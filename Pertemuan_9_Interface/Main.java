package Pertemuan_9_Interface;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
        Phone Redme3Pro = new Xiaomi();
        PhoneUser siti = new PhoneUser(Redme3Pro);
        
        siti.turnOnThePhone();
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("====== APLIKASI INTERFACE ======");
            System.out.println("[1] Nyalakn Hp");
            System.out.println("[2] Matikan Hp");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Perkecil Volume");
            System.out.println("[0] Keluar");
            System.out.println("Pilih Aksi");
            
            String aksi = input.nextLine();
            
            if(aksi.equals("1")){
                siti.turnOnThePhone();
            }else
                
            if(aksi.equals("2")){
                siti.turnOffThePhone();
            }else 
                
            if(aksi.equals("3")){
                siti.makePhoneLouder();
            }else
                
            if(aksi.equals("4")){
                siti.makePhoneSilent();
            }else
                
            if(aksi.equals("0")){
                System.exit(0);
            }else{
                System.out.println("Salah woi...");
                
            }
        }
       
    }
    
}
