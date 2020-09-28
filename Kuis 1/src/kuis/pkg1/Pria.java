package kuis.pkg1;
import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class Pria extends Manusia {

    private String namaIstri;

    public void setNamaIstri() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Istri Anda: ");
        String newValue = sc.next();
        namaIstri = newValue;
        System.out.println("=============================");
        System.out.println("Profil Pria");
    }

    public void infoPria() {
        System.out.println("Profil Pria");
        if (super.getDewasaPria() == true) {
            System.out.println("Harus Punya Istri");
            setNamaIstri();
            System.out.println("Nama Istri: " + namaIstri);
        } else {
            System.out.println("Pria ini masih kuliah");
        }
    }
}
