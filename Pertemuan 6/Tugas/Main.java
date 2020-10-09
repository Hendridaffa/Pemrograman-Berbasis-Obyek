/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS ROG
 */
public class Main {

    public static void main(String[] args) {

        Dosen d1 = new Dosen();
        d1.setNama("Athaya");
        d1.setSKS(22);

        Pegawai p1 = new Pegawai();
        p1.setNama("Daffa");

        DaftarGaji daftar_gaji = new DaftarGaji(3);
        daftar_gaji.addPegawai(d1);
        daftar_gaji.addPegawai(p1);
        daftar_gaji.printSemuaGaji();
    }
}
