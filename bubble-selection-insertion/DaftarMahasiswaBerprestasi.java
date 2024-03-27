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
    void insertionSort(){
        for(int i = 0; i < ListMhs.length; i++){
            Mahasiswa temp = ListMhs[i];
            int j =i;
            while(j > 0 && ListMhs[j-1].ipk < temp.ipk){
                ListMhs[j] = ListMhs[j-1];
                j--;
            }
            ListMhs[j] = temp;
        }
    }
}