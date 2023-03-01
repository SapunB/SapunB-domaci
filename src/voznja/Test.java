package voznja;

import java.net.StandardSocketOptions;

public class Test {
    public static void main(String[] args) {
        Vozilo Vozilo1 = new Vozilo("RS7", "Audi", "ABCDE", 1,12, Tip.AUTO);
        Vozac Vozac1 = new Vozac("Stevan", "Sapun", 10);
        System.out.println(Vozac1.Ime + Vozilo1.Model);
        System.out.println(Vozac1);
        System.out.println(Vozilo1);
        Kamion Kamion1 = new Kamion("Model", "Proiz", "Tablica", 1, 12, Tip.KAMION);
        System.out.println(Vozac1.Ime + Kamion1.Model);
        System.out.println(Vozac1);
        System.out.println(Kamion1);

        System.out.println(Vozilo1.tipVozila);
        System.out.println(Kamion1.tipVozila);

        Vozilo1.randomFja();

        System.out.println(Vozilo1.Potrosnja());
        System.out.println(Kamion1.Potrosnja());
    }
}
