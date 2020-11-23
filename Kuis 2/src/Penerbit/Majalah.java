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
public class Majalah extends MediaInformasi{

    @Override
    public void setJmlHalaman(int jmlHalaman) {
        super.setJmlHalaman(jmlHalaman); 
        System.out.println("Majalah ini memiliki: "+jmlHalaman+" halaman");
        System.out.println();
        System.out.println("Jika dihitung dengan covernya, maka jumlah halaman dari"
                + " majalah tersebut: " + (jmlHalaman + 2) + " halaman");
    }
    
    @Override
    public void reputasi() {
        super.reputasi();
        System.out.println("Penerbit Majalah ini bereputasi! \n");
    }
}
