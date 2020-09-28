package ac.id.polinema.relasiclass.percobaan1;

/**
 *
 * @author ASUS ROG
 */
public class Laptop {

    private String merk;
    private Processor proc;

    Laptop() {

    }

    Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public void setmerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public Processor getProc() {
        return proc;
    }

    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
