package voznja;

public class Vozilo {
    public String Model;
    public String Proizvodjac;
    public String Tablice;
    public int CenaGoriva;
    public Tip tipVozila;
    public int Kilometraza;
    public Vozilo(){

    }
    public Vozilo(String Model, String Proizvodjac, String Tablice, int CenaGoriva, int Kilometraza, Tip tip){
        this.Model = Model;
        this.Proizvodjac = Proizvodjac;
        this.Tablice = Tablice;
        this.CenaGoriva = CenaGoriva;
        this.Kilometraza = Kilometraza;
        this.tipVozila = tip;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getProizvodjac() {
        return Proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        Proizvodjac = proizvodjac;
    }

    public String getTablice() {
        return Tablice;
    }

    public void setTablice(String tablice) {
        Tablice = tablice;
    }

    public int getCenaGoriva() {
        return CenaGoriva;
    }

    public void setCenaGoriva(int cenaGoriva) {
        CenaGoriva = cenaGoriva;
    }

    public Tip getTipVozila() {
        return tipVozila;
    }

    public void setTipVozila(Tip tipVozila) {
        this.tipVozila = tipVozila;
    }

    public int getKilometraza() {
        return Kilometraza;
    }

    public void setKilometraza(int kilometraza) {
        Kilometraza = kilometraza;
    }

    public int Potrosnja(){
        return Kilometraza/100*CenaGoriva*8;
    }

    public void randomFja() {
        if(tipVozila.equals(Tip.AUTO))
            System.out.println("Vozilo je auto");
        else if(tipVozila.equals(Tip.KAMION))
            System.out.println("Vozilo je kamion");
        else
            System.out.println("Vozilo je motor");
    }

    @Override
    public String toString(){
        return("Vozilo:\n" + "model = " + Model + "Proizvodjac = " + Proizvodjac + "Tablice = " + Tablice);
    }
}
