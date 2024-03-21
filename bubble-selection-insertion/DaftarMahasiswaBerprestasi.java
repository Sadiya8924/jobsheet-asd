public class DaftarMahasiswaBerprestasi{
    Mahasiswa ListMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if(idx < ListMhs.length){
            ListMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for(Mahasiswa m : ListMhs){
            m.tampil();
            System.out.println("----------------------");
        }
    }
    void selectionSort(){
        for(int i = 0; i < ListMhs.length-1; i++){
            int idxMin = i;
            for(int j = 1 + i; j < ListMhs.length; j++){
                if(ListMhs[j].ipk < ListMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa tmp = ListMhs[idxMin];
            ListMhs[idxMin] = ListMhs[i];
            ListMhs[i] = tmp;
        }
    }
}