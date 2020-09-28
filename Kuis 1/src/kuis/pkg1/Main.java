package kuis.pkg1;

/**
 *
 * @author ASUS ROG
 */
public class Main {

    public static void main(String[] args) {
        Pria p = new Pria();
        Wanita w = new Wanita();

        System.out.println("Contoh Pria dan Wanita Belum Dewasa");
        System.out.println("=================================");
        p.setUmur(22);
        p.setNama("Young Alexander");
        p.infoPria();
        System.out.println(" ");

        w.setUmur(19);
        w.setNama("Karin Novilda");
        w.infoWanita();
        System.out.println(" ");

        p.setData(25, "Dimas");
        p.infoPria();

        w.setData(23, "Susan Sameh");
        w.infoWanita();
    }
}
