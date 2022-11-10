public class jamsibuknya {
  
    public static void main (String [] args) {
     asdos a = new asdos ("Faizurikum", 21,10);           //   upcasting    
     dosen b = new dosen ("Raja OP Damanik", 5);         //   upcasting  
     asdos c = new asdos ("Angel-chan", 20,4);           //   upcasting  
     mahasiswa d = new mahasiswa ("Firman",20);                     //   upcasting  
     mahasiswa e = new mahasiswa ("Nid to Pass this sem", 23);      //   upcasting  
     dosen f = new dosen ("Nivotko",3);                 //   upcasting  
    
     int total = a.getJamSibuk()+b.getJamSibuk()+c.getJamSibuk()+d.getJamSibuk()+e.getJamSibuk()+f.getJamSibuk();   //polymorphism upcasting 
     System.out.println("Total jam sibuk elemen Fasilkom adalah "+total);
     
        a.mailCheck();
        b.mailCheck();
        c.mailCheck();
        d.mailCheck();
        e.mailCheck();
        f.mailCheck();
        System.out.println (a.getJamSibuk());
        System.out.println (b.getJamSibuk());
        System.out.println (c.getJamSibuk());
        System.out.println (d.getJamSibuk());
        System.out.println (e.getJamSibuk());
        System.out.println (f.getJamSibuk());
}
}
