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
    void bubbleShort(){
        for(int i = 0; i < ListMhs.length-1; i++){
            for(int j = 1; j < ListMhs.length-1; j++){
                if(ListMhs[j].ipk > ListMhs[j-1].ipk){
                    Mahasiswa tmp = ListMhs[j];
                    ListMhs[j] = ListMhs[j-1];
                    ListMhs[j-1] = tmp;
                }
            }
        }
    }
}