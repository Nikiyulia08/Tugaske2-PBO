public class mahasiswa extends elemen {    //polymorphism
    private int sks ;
    public int getSks() {
        return sks;
    }

    public int jamSibuk;
   
    public int getJamSibuk() {
        return jamSibuk;
    }
    
    int getJamSibuk;
    public mahasiswa(String nama, int sks) {
        super(nama);
        jamSibuk = sks *3;
    }

    public void mailCheck(){
        System.out.println(this.nama + "adalah seorang mahasiswa dengan jam sibuk" + getJamSibuk());
    }
    

}
