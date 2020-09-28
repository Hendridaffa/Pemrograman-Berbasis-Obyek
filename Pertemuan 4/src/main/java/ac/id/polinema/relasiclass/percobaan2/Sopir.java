package ac.id.polinema.relasiclass.percobaan2;

/**
 *
 * @author ASUS ROG
 */
public class Sopir {

    private String nama;
    private int biaya;

    Sopir() {

    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}
