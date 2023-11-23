package Tugas_Pertemuan_9;
public class ControlRemot {
private Remot_TV remot;

public ControlRemot(Remot_TV remot){
    this.remot = remot;
}
void turnOnTheTV(){
    this.remot.powerOn();
}
void turnOffTheTV(){
    this.remot.powerOff();
}
void makeTVLouder(){
    this.remot.volumeUp();
}
void makeTVSilent(){
    this.remot.volumeDown();
}
void changeChannelTVafter (){
    this.remot.ChannelAfter();
}
void changeChannelTVbefore (){
    this.remot.ChannelBefore();
}
}
