package uts;

/**
 *
 * @author ASUS ROG
 */
public class Main {

    public static void main(String[] args) {
        SepedaMotor honda = new SepedaMotor("Vario", "Honda");
        System.out.println(honda.getMerekMotor());
        System.out.println(honda.getMerekMesin());
        honda.tambahKecepatanMotor();
        honda.tambahKecepatanMotor();
        honda.kurangiKecepatanMotor();

        System.out.println();
        SepedaMotor yamaha = new SepedaMotor("NMax", "Yamaha");
        System.out.println(yamaha.getMerekMotor());
        System.out.println(yamaha.getMerekMesin());
        honda.tambahKecepatanMotor();
        honda.tambahKecepatanMotor();
        honda.kurangiKecepatanMotor();
    }

}
