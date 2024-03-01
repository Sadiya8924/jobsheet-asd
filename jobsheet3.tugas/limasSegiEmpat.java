public class limasSegiEmpat {
    int sisiAlas;
    int tinggi;

    public limasSegiEmpat(int sisi, int tl){
        sisiAlas = sisi;
        tinggi = tl;
    }
    public limasSegiEmpat(){
    }
    public double hitungVolLimas(){
        return tinggi * Math.pow(sisiAlas, 2) * 1/3;
    }
    public double hitungLPLimas(){
        return 4 * Math.pow(sisiAlas, 2) * 1/2 * tinggi;
    }
}