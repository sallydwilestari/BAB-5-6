public class phone {
    private String merk;
    private int harga;
    public phone() {
    }
    public phone (String merk){
        this.merk=merk;
    }
    public phone (String merk,int harga) {
        this.merk=merk;
        this.harga=harga;
    }
    public void lihatPhone(){
         System.out.println("Merk :"+merk);
         System.out.println("Harga :"+harga);
         System.out.println("");
    }
}
public class DemoOverLoading{
    public static void main (String args[]){
        System.out.println("");
        Phone p1 = new phone ();
        Phone p2 = new phone ("Nokia");
        Phone p3 = new phone ("Sony Ericsoon",500);
System.out.println("perbedaan output dari masing-masing konstruktor");
        p1.lihatPhone ();
        p2.lihatPhone ();
        p3.lihatPhone ();

        Phone p4,p5;
        p4 = new Phone();
        p5 = new Phone();
        p4.isiPhone("Samsung");
        p5.isiPhone("Samsung",5000);
System.out.println("perbedaan output dari masing-masing method");
        p4.lihatPhone();
        p5.lihatPhone();
    }
}