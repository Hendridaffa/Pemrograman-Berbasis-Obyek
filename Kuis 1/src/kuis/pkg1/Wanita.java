package kuis.pkg1;

import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class Wanita extends Manusia {

    private String namaSuami;
    private String namaAnak;

    public void setNamaSuami() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Suami Anda :");
        String newValue = sc.next();
        namaSuami = newValue;
        System.out.println("Profil Wanita");
        super.info();
    }

    public void setNamaAnak() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Anak: ");
        String newValue = sc.next();
        namaAnak = newValue;
        System.out.println("=============================");
        System.out.println("Profil Wanita");
        super.info();
    }

    public void infoWanita() {
        System.out.println("Profil Wanita");
        super.info();
        if (super.getDewasaWanita() == true) {
            System.out.println("Wanita sudah dewasa harus punya suami");
            setNamaSuami();
            setNamaAnak();
            System.out.println("Nama Suami: " + namaSuami);
            System.out.println("Nama Anak: " + namaAnak);
        } else {
            System.out.println("Wanita ini masih kuliah");
            System.out.println("=============================");
        }
    }
}
