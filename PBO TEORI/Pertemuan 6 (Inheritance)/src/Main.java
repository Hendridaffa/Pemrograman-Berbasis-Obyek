

/**
 *
 * @author ASUS ROG
 */
public class Main {
    public static void main(String[] args) {
        
        //Bangun Datar
        BangunDatar bangunDatar = new BangunDatar();
    
        //Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        //Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        //Segitiga
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;
        
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
