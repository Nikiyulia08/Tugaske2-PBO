public class dosen extends elemen{
    private int jumlahHariKerja;
    public int jamSibuk;
    
    public int getJumlahHariKerja(){
        return jumlahHariKerja;
    }
    public int getJamSibuk(){
        return jamSibuk;
    }

    public dosen (String nama, int jumlahHariKerja){
        super (nama);
        jamSibuk = jumlahHariKerja*8;
    }
    
    public void mailCheck(){  //upcasting
        System.out.println (this.nama + "adalah seorang dosen dengan jam sibuk" +getJamSibuk());
    }

}
