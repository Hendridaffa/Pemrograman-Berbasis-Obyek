package lingkaran;
import java.util.Scanner;
/**
 *
 *
 *
 */
public class ProgramLingkaran {

    
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.print("Masukkan nilai jari-jari = ");
        l1.r = sc.nextDouble();
        l1.PHI = 3.14;
        System.out.printf("Luas lingkaran = %.2f", l1.hitungLuas());
        System.out.println();
        System.out.printf("Keliling lingkaran = %.2f", l1.hitungKeliling());
        System.out.println();
    }
    
}
