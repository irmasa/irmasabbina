package Tugas_Pertemuan_9;
public class Panasonic implements Remot_TV{
    
private int volume;
private boolean isPowerOn; 
private int currentChannel;

    public Panasonic (){
        this.volume = 50;
    }
    public int getVolume(){
       return this.volume;
    }
    public int Panasonic (){
        this.currentChannel = 30;
        return this.currentChannel;
    }
    public int getChannel(){
        return this.currentChannel;
    }
    @Override
    public void powerOn() {
     isPowerOn = true; 
        System.out.println("TV Menyala...");
        System.out.println("Selamat datang di PANASONIC");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("TV Dimatikan...");
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
            System.out.println("Nyalakan dulu TV mu...");
        }   
    }

    @Override
    public void volumeDown() {
      if(isPowerOn){
        if(this.volume == MIN_VOLUME){
            System.out.println("suara habis!");
            System.out.println("Sudah" + this.getVolume()+"%");
        }else{
            this.volume-=10;
            System.out.println("Volume sekarang"+this.getVolume()+"%");
        }
        }else{
            System.out.println("Nyalakan dulu TV mu...");
        }  
    }
    @Override
    public void ChannelAfter() {
       if(isPowerOn){
           if(this.currentChannel == BEFORE){
            System.out.println("Channel berganti ke setelahnya ");
            System.out.println("Channel ke " + this.getChannel());
        }else{
            this.currentChannel+= 2;
            System.out.println("Chennel ke "+this.getChannel());
        }
    }else{
            System.out.println("Nyalakan dulu TV mu...");
        } 
    }
    @Override
    public void ChannelBefore() {
       if(isPowerOn){
           if(this.currentChannel == AFTER){
            System.out.println("Channel berganti ke sebelumnya ");
            System.out.println("Channel ke " + this.getChannel());
        }else{
            this.currentChannel-= 1;
            System.out.println("Chennel ke "+this.getChannel());
        }
    }else{
            System.out.println("Nyalakan dulu TV mu...");
        } 
    }
}
