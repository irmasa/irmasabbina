package Pertemuan_8_Polimorfisme_Dinamis;
public class Persegi extends BangunDatar{
int sisi;
public Persegi (int sisi){
    this.sisi=sisi;
}

@Override
public float luas(){
    return this.sisi*this.sisi;
}
@Override
public float keliling(){
    return this.sisi*4;
}
}
