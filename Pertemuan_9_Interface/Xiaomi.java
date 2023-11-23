package Pertemuan_9_Interface;
public class Xiaomi implements Phone{
    private int volume;
    private boolean isPowerOn;

    public Xiaomi (){
        this.volume = 50;
    }
    public int getVolume(){
       return this.volume;
    }
    
    @Override
    public void powerOn() {
       isPowerOn = true; 
        System.out.println("Handphone Menyala...");
        System.out.println("Selamat datang di XIAOMI PHONE");
        System.out.println("Android version 100");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone Dimatikan...");
    }

    @Override
    public void volumeUp() {
        if(isPowerOn){
        if(this.volume == MAX_VOLUME){
            System.out.println("Volume FULL");
            System.out.println("Sudah" + this.getVolume()+"%");
        }else{
            this.volume+=10;
            System.out.println("Volume sekarang"+this.getVolume()+"%");
        }
        }else{
            System.out.println("Nyalakan dulu Handphone mu...");
        }
    }

    @Override
    public void volumeDown() {
      if(isPowerOn){
        if(this.volume == MIN_VOLUME){
            System.out.println("Volume mencapai bagian paling rendah");
            System.out.println("Sudah" + this.getVolume()+"%");
        }else{
            this.volume-=10;
            System.out.println("Volume sekarang"+this.getVolume()+"%");
        }
        }else{
            System.out.println("Nyalakan dulu Handphone mu...");
        }  
    }
   
}
