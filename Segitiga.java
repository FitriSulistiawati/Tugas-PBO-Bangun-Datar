public class Segitiga extends BangunDatar {
    
    public Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3){
        super.setNama("SEGITIGA");
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
