
package Interface;

import Interface.Mahasiswa;
import Interface.ICumlaude;
import Interface.IBerprestasi;

public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi {

    public PascaSarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku mahasiswa,namaku Elok");
        System.out.println("Aku berkuliah diPolinema");
        System.out.println("Aku sudah menyelesaikan THESIS");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71");
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya Menerbitkan artikel di jurnal INTERNASIONAL");
    }
    
}