public class kerucut {
    int jariJari;
    int sisiMiring;

    public kerucut(int r, int s){
        jariJari = r;
        sisiMiring = s;
    }
    public kerucut(){
    }
    public double hitungVolKerucut(){
        return 3.14 * Math.pow(jariJari, 2) * 1/3 * sisiMiring; 
    }
    public double hitungLPKerucut(){
        return 3.14 * jariJari * (jariJari + sisiMiring);
    }
}