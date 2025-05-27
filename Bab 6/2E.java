public class lagu {
    private String band;
    private String judul;
    public void isiParam (String judul,String band) {
        this.judul = judul;
        this.band=band;
    }
    public void cetakKelayar(){
        if(judul==null && band==null)return;
        System.out.println("Judul: "+judul+"\inBand:"+ pencipta);
    }
}
    public class DemoLagu {
        public static void main (String[] args) {
            Lagu song = new lagu ();
            song.isiParam("Dance Beside","All American Reject");
            song.cetakKelayar();
        }
    }