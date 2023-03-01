package voznja;

public class Vozac {
    public String Ime;
    public String Prezime;
    public int ID;

    public Vozac(){

    }

    public Vozac(String Ime, String Prezime, int ID){
        this.Ime = Ime;
        this.Prezime = Prezime;
        this.ID = ID;
    }

    public String getIme() {
        return Ime;
    }

    public void setIme(String ime) {
        Ime = ime;
    }

    public String getPrezime() {
        return Prezime;
    }

    public void setPrezime(String prezime) {
        Prezime = prezime;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString(){
        return("Vozac:\n" + "Ime = " + Ime + "Prezime = " + Prezime + "ID = " + ID);
    }
}
