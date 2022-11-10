public class asdos extends mahasiswa {
    private int jamNgasdos;
    public asdos(String nama, int sks, int jamNgasdos) {
        super(nama, sks);
        jamSibuk = jamSibuk + jamNgasdos;
    }
   
    public void setJamNgasdos(int jamNgasdos) {
        this.jamNgasdos = jamNgasdos;
    }

    public int getJamNgasdos(){
        return jamNgasdos;
    }

    public void mailCheck(){
        System.out.println (this.nama + "adalah seorang asdos dengan jam sibuk" + getJamSibuk());
    }
    

}
