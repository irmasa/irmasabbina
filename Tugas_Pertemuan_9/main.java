package Tugas_Pertemuan_9;
import java.util.Scanner;
public class main {
public static void main(String[] args) {
   Remot_TV Samsung = new Panasonic();
   ControlRemot IKE = new ControlRemot(Samsung);
        
   IKE.turnOnTheTV();
   Scanner input = new Scanner(System.in);
   String aksi = null;
   
   while(true){
            System.out.println("====== APLIKASI INTERFACE ======");
            System.out.println("[1] Nyalakn TV");
            System.out.println("[2] Matikan TV");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Perkecil Volume");
            System.out.println("[5] Ganti Channel Setelahnya");
            System.out.println("[6] Ganti Channel Sebelumnya");
            System.out.println("[0] Keluar");
            System.out.println("Pilih Aksi");
            
            aksi = input.nextLine();
            
    if(aksi.equals("1")){
                IKE.turnOnTheTV();
            }else
                
            if(aksi.equals("2")){
                IKE.turnOffTheTV();
            }else 
                
            if(aksi.equals("3")){
                IKE.makeTVLouder();
            }else
                
            if(aksi.equals("4")){
                IKE.makeTVSilent();
            }else
                
            if(aksi.equals("5")){
                IKE.changeChannelTVafter();
            }else
                
            if(aksi.equals("6")){
                IKE.changeChannelTVbefore();
            }else
                
            if(aksi.equals("0")){
                System.exit(0);
            }else{
                System.out.println("Salah woi...");
                
            }
    }
} 
}
