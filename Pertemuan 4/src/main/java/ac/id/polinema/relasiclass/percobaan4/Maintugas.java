package ac.id.polinema.relasiclass.percobaan4;

import ac.id.polinema.relasiclass.percobaan3.Pegawai;

/**
 *
 * @author ASUS ROG
 */
public class Maintugas {

    public static void main(String[] args) {
        Penumpang p = new Penumpang("001", "Jokowi");
        Pesawat pesawat = new Pesawat("Presiden", 01);
        pesawat.setPenumpang(p, 1);
        System.out.println(pesawat.info());

        Pegawai pilot = new Pegawai("03892010", "Capt. Hendri Daffa");
        Pegawai coPilot = new Pegawai("0892012", "Alinka");
        Pesawat p1 = new Pesawat("Garuda Indonesia", "VVIP Class", pilot, coPilot);
        System.out.println(p1.info1());
    }
}
