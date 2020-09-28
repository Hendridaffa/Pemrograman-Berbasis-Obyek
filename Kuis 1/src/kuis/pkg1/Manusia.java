package kuis.pkg1;

/**
 *
 * @author ASUS ROG
 */
public class Manusia {

    private int umur;
    private String nama;
    private boolean dewasa;

    public void setUmur(int angka) {
        umur = angka;
    }

    public int getUmur() {
        return umur;
    }

    public void setNama(String huruf) {
        nama = huruf;
    }

    public String getNama() {
        return nama;
    }

    public void setData(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;

    }

    public boolean getDewasaPria() {
        if (umur <= 22) {
            dewasa = false;
        } else {
            dewasa = true;
        }
        return dewasa;
    }

    public boolean getDewasaWanita() {
        if (umur <= 20) {
            dewasa = false;
        } else {
            dewasa = true;
        }
        return dewasa;
    }

    public void info() {

        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur());
    }
}

