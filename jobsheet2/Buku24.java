public class Buku24 {

    String judul, pengarang;
    int halaman, stok, harga;
    
    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stock: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml){
        stok -= jml;
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

    public Buku24(){

    }

    public Buku24(String jud, int har, int hal, String pg){
        judul = jud;
        harga = har;
        halaman = hal;
        pengarang = pg;
    }

    public Buku24(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}