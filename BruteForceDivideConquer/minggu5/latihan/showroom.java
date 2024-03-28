public class showroom {
    String merk, tipe;
    int tahun, topAcceleration, topPower;

    public showroom(String merk, String tipe, int tahun, int topAcc, int topPow){
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        topAcceleration = topAcc;
        topPower = topPow;
    }
    public int getTopAcceleration(){
        return topAcceleration;
    }
    public int getTopPower(){
        return topPower;
    }
}