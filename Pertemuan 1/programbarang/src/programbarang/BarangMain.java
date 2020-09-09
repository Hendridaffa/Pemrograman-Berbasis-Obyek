package programbarang;

/**
 *
 * @author ASUS
 */
public class BarangMain {

    public static void main(String[] args) {
        Barang b1 = new Barang();
        Barang b2 = new Barang();
        
        b1.kode = "101";
        b1.namaBarang = "Iphone 11 Pro";
        b1.hargaDasar = 15000000;
        b1.diskon = 30;
        b1.tampilData();
        
        b2.kode = "102";
        b2.namaBarang = "Iphone 11 ProMax";
        b2.hargaDasar = 200000000;
        b2.diskon = 15;
        b2.tampilData();
    }
}
