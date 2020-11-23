/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penerbit;

/**
 *
 * @author ASUSROG
 */
public class Buku extends MediaInformasi {

    @Override
    public void setJmlHalaman(int jmlHalaman) {
        super.setJmlHalaman(jmlHalaman);
        System.out.println("Buku ini memiliki: "+jmlHalaman+" halaman");
        System.out.println();
        System.out.println("Jika dihitung dengan covernya, maka jumlah halaman dari"
                + " buku tersebut: " + (jmlHalaman + 4) + " halaman, lebih tebal daripada"
                        + " majalah karensa terdapat cover dalam dan cover luar");
    }

    @Override
    public void reputasi() {
        super.reputasi(); 
        System.out.println("Penerbit Buku ini bereputasi!");
    }

}
