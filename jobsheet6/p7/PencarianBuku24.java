package p7;

public class PencarianBuku24 {

    Buku24 listBk[] = new Buku24[5];
    int idx;

    void tambah(Buku24 m){
        if (idx < listBk.length){
            listBk[idx] = m;
            idx++;
        } else{
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil(){
        for (Buku24 m : listBk){
            m.tampilDataBuku();
        }
    }
    public int FindSearch(String cari){
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++){
            if (listBk[j].kodeBuku == cari){
                posisi = j;
                break;
            }
        } return posisi;
    }
    public void tampilPosisi(int x, int pos){
        if(pos >= 0){
            System.out.println("data: " + x + " ditemukan pada index " + pos);
        }else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
    public void tampilData(int x, int pos){
        if (pos != -1){
            System.out.println("Kode buku\t : " + x);
            System.out.println("Judul\t\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t\t : " + listBk[pos].stock);
        } else {
            System.out.println("data " + x + " data tidak di temukan");
        }
    }
    public Buku24 FindBuku(String cari) {
        for (Buku24 m : listBk) {
            if (m.kodeBuku == cari) {
                return m;
            }
        }
        return null;
    }
    public int FindBinarySearch(String cari, int left, int right) {
        if (right >= left) {
            int mid = (right + left) / 2;
            int comparison = cari.compareTo(listBk[mid].kodeBuku);
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}