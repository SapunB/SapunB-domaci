package voznja;

public class Kamion extends Vozilo{
    public Kamion(String Model, String Proizvodjac, String Tablice, int CenaGoriva, int Kilometraza, Tip tip) {
        this.Proizvodjac = Proizvodjac;
        this.Model = Model;
        this.Tablice = Tablice;
        this.CenaGoriva = CenaGoriva;
        this.Kilometraza = Kilometraza;
        this.tipVozila = tip;
    }

    public int Potrosnja(){
        return Kilometraza/100*CenaGoriva*8;
    }
}
