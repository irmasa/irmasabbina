package Pertemuan_8_Polimorfisme_Dinamis;
public class Lingkaran extends BangunDatar{
    int r;
    public Lingkaran (int r){
        this.r= r;
    }
    
    @Override
    public float luas(){
        return (float) Math.PI*r*r;
    }
    
    @Override
    public float keliling(){
        return (float) (2* Math.PI * r);
    }
}
