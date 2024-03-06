public class Persegi extends BangunDatar {

    public Persegi(double panjang, double lebar, double sisi) {
        super.setNama("PERSEGI");
        this.hitungLuas( panjang,  lebar);
        this.hitungKeliling( sisi);
    }
    
    public void hitungLuas (double panjang, double lebar){
        super.luas = panjang * lebar;
    }

    public void hitungKeliling (double sisi){
        super.Keliling = 4 * sisi;
    }
    
}
