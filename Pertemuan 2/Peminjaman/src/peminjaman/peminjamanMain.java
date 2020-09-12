package peminjaman;

import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class peminjamanMain {
    public static void main(String[] args) {
        Peminjaman pinjam = new Peminjaman();
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
            
        System.out.print("Masukkan ID : ");
        pinjam.id = sc.nextInt();
        System.out.print("Masukkan Nama : ");
        pinjam.nama = s.nextLine();
        System.out.print("Masukkan Judul Game : ");
        pinjam.judulGame = s.nextLine();
        System.out.print("Masukkan Harga : ");
        pinjam.harga = sc.nextInt();      
        System.out.print("Masukkan transaksi : ");
        pinjam.transaksi = sc.nextInt();
        
        
        System.out.println();
        System.out.println("HASIL PEMINJAMAN");
        pinjam.hasilPeminjaman(pinjam.id, pinjam.judulGame, 
                    pinjam.judulGame, pinjam.harga);
        
        System.out.println();
        System.out.println("TOTAL BAYAR");
        pinjam.hargaBayar(pinjam.transaksi, pinjam.harga);
        
    }
}

