public class Buku24 {

    String judul, pengarang;
    int halaman, stok, harga, jumlahTerjual;
    
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
        jumlahTerjual = jml;
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

    public int hitungHargaTotal(int jml){
        return harga* (stok - 1);
    }

    int hitungDiskon(){
        int totalHarga = hitungHargaTotal(jumlahTerjual);
        if (totalHarga > 150000){
            return (int)(0.12 * totalHarga);
        }
        else if (totalHarga >= 75000){
            return (int)(0.05 * totalHarga);
        }else {
            return 0;
        }
    }

    int hitungHargaBayar(){
        int totalHarga = hitungHargaTotal(jumlahTerjual);
        int diskon = hitungDiskon();
        return totalHarga - diskon;
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