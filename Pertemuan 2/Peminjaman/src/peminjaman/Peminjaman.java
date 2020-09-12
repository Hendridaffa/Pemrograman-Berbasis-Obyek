package peminjaman;

/**
 *
 * @author ASUS ROG
 */
public class Peminjaman {
 public int id;
    public String nama;
    public String judulGame;
    public int harga;
    public int bayar;
    public int transaksi;
    
    public void hasilPeminjaman(int a, String b, String c, int d){
        id = a;
        nama = b;
        judulGame = c;
        harga = d;
        
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);        
        System.out.println("Judul Game : " + judulGame);
        System.out.println("Harga : " + harga);
    }
    
    public int hargaBayar(int d, int e){
        transaksi = d;
        harga = e;
        bayar = transaksi * harga;
        
        System.out.println("MASUKKAN TRANSAKSI : " + transaksi);
        System.out.println("HARGA : " + harga);
        System.out.println();
        System.out.println("TOTAL BAYAR : " + bayar);
        
        return bayar;
    }
}