public class TestBangunDatar {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(2, 5, 10, 5, 5);
        Lingkaran lingkaran = new Lingkaran(5);
        Persegi persegi = new Persegi(2, 5, 5);
        segitiga.getInfo();
        lingkaran.getInfo();
        persegi.getInfo();
    }
}