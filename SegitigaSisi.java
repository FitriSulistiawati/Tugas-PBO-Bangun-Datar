public class SegitigaSisi extends Segitiga {

    public SegitigaSisi (double alas, double tinggi, double sisi) {
        super(alas, tinggi, sisi, 0, 0);
        super.setNama("SEGITIGA SAMA SISI");
        this.hitungLuas(alas, tinggi);
        this.hitungKeliling(sisi);
    }
    
    public void hitungLuas(double alas, double tinggi){
        super.luas = 0.5 * alas * tinggi;
    }
    
    public void hitungKeliling (double sisi){
        super.Keliling = 3 * sisi;
    }
}