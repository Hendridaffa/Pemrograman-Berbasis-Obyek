
package Interface;
import Interface.ICumlaude;
import Interface.Mahasiswa;
import Interface.PascaSarjana;
import Interface.Rektor;
import Interface.Sarjana;
public class interfacemain {
    
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        
        Mahasiswa mahasiswaBiasa = new Mahasiswa("Rega");
        Sarjana SarjanaCumlaude = new Sarjana("Hendri");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        pakrektor.beriSertifikatCumlaude(mahasiswaBiasa);
        pakrektor.beriSertifikatCumlaude(SarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
    }
    
}
