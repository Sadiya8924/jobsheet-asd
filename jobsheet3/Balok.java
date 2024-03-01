public class Balok {

    public int panjang, lebar, tinggi;
    //konstruktor 1
    public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    //konstruktor 2
    public Balok(int sisi){
        panjang = sisi;
        lebar = sisi;
        tinggi = sisi;
    }

    public int hitungVolume(){
        return panjang * lebar * tinggi;
    }
}