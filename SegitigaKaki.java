public class SegitigaKaki extends Segitiga {
    
    public SegitigaKaki (double alas, double tinggi, double sisi) {
        super.setNama("SEGITIGA SAMA KAKI");
        this.hitungLuas(alas, tinggi);
        this.hitungKeliling(sisi, alas);
    }

    public void hitungLuas(double alas, double tinggi){
        super.luas = 0.5 * alas * tinggi;
    }

    public void hitungKeliling (double sisi, double alas){
        super.Keliling = 2 * sisi + alas; 
    }
}
