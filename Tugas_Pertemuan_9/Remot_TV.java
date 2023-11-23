package Tugas_Pertemuan_9;
public interface Remot_TV {
 int MAX_VOLUME = 100;
 int MIN_VOLUME = 0;
 int AFTER = 200;
 int BEFORE = 1;
 
 void powerOn();
 void powerOff();
 void volumeUp();
 void volumeDown();
 void ChannelAfter();
 void ChannelBefore();
 
}
