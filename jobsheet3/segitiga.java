public class segitiga {

    public int alas;
    public int tinggi;

    public segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling(){
        return Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2)) + alas + tinggi;
    }
}