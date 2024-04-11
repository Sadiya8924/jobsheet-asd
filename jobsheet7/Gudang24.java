public class Gudang24 {
    Barang24[] tumpukan;
    int size, top;

    public Gudang24(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang24[size];
        top = -1;
    }

    public boolean cekKosong(){
        if(top == -1){return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh(){
        if(top == size -1){
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang24 brg){
        if(!cekPenuh()){
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else{
            System.out.println("Gagal! tumpuka barang do gudang sudah penuh");
        }
    }

    public Barang24 ambilBarang(){
        if(!cekKosong()){
            Barang24 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        }else{
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang24 lihatBarangTeratas(){
        if(!cekPenuh()){
            Barang24 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else{
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }  

    public void tampilkanBarang(){
        if(!cekKosong()){
            System.out.println("Rincian tumpukan barang diGudang: ");
            //for (int i = top; i >= 0; i--)
            for(int i = 0; i <= top; i++){
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }else{
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String konversiDesimalKeBiner(int kode){
        StackKonversi stack = new StackKonversi();
        while (kode > 0){
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()){
            biner += stack.pop();
        } return biner;
    }
}