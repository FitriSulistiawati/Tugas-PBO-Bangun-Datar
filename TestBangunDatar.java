public class TestBangunDatar {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(2, 5, 10, 5, 5);
        Lingkaran lingkaran = new Lingkaran(5);
        Persegi persegi = new Persegi(2, 5, 5);
        SegitigaKaki segitigaKaki = new SegitigaKaki(2, 5, 5);
        SegitigaSembarang segitigaSembarang = new SegitigaSembarang(2, 5, 5, 3, 4);
        SegitigaSiku segitigaSiku = new SegitigaSiku(0, 0, 2, 5, 5);
        SegitigaSisi segitigaSisi = new SegitigaSisi(2, 5, 5);
        segitiga.getInfo();
        lingkaran.getInfo();
        persegi.getInfo();
        segitigaKaki.getInfo();
        segitigaSembarang.getInfo();
        segitigaSiku.getInfo();
        segitigaSisi.getInfo();
    }
}