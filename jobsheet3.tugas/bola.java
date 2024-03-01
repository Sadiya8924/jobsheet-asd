public class bola{
    int jariJari;

    public bola(int r){
        jariJari = r;
    }
    public bola(){

    }
    public double hitungVolBola(){
        return 3.14 * Math.pow(jariJari, 3) * 4/3;
    }
    public double hitungLPBola(){
        return 4 * 3.14 * Math.pow(jariJari, 2);
    }
}