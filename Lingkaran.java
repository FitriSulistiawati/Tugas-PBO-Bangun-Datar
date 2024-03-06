public class Lingkaran extends BangunDatar {
    public Lingkaran (double r){
        super.setNama("LINGKARAN");
        this.hitungLuas(r);
        this.hitungKeliling(r);

    }

    public void hitungLuas (double r){
        super.luas = 3.41 * r * r;
    }

    public void hitungKeliling (double r) {
        super.Keliling = 2 * 3.14 * r;
    }
}