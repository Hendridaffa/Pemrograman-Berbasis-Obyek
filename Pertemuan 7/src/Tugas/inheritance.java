package Tugas;

import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class inheritance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih = 0;
        System.out.println("Menampilkan Spesifikasi Komputer");
        System.out.println("1. Laptop Mac");
        System.out.println("2. Laptop Windows");
        System.out.println("3. Pc");
        System.out.println("4. Exit");
        System.out.println("pilih : ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                mac m = new mac();
                System.out.println("Masukan Merk : ");
                m.merk = input.next();
                System.out.println("Masukan Prosessor " + m.merk + " : ");
                m.kecProsesor = input.nextInt();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
        pc pc = new pc("ASUS ROG", 3, 6, "Inter core i7", 15);
        pc.tampilPc();

        mac mac = new mac("MacBook", 4, 8, "Quad-core i7", "Polimer", "Private internet access");
        mac.tampilMac();

        windows windows = new windows("Taf Gaming", 3, 6, "Intel core i7 gen 7th", "Li-ion", "Ai");
        windows.tampilWindows();
    }
}
