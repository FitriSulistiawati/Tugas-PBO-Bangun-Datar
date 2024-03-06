public class SegitigaSembarang extends Segitiga {
    
    public SegitigaSembarang(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        super(alas, tinggi, sisi1, sisi2, sisi3);
        super.setNama("SEGITIGA  SEMBARANG");
        this.hitungLuas(alas, tinggi);
        this.hitungKeliling(sisi1, sisi2, sisi3);
    }

    public void hitungLuas(double alas, double tinggi){
        super.luas = 0.5 * alas * tinggi;
    }

    public void hitungKeliling (double sisi1, double sisi2, double sisi3){
        super.Keliling = sisi1 + sisi2 + sisi3;
    }
}
