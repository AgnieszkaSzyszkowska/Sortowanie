public class Osoba implements Comparable<Osoba> {
    private String imie;
    private String nazwisko;
    private int wiek;
    private int wzrost;
    private double waga;

    public int compareTo(Osoba o) {
        return (nazwisko.compareTo(o.getNazwisko()));
    }

    public String toString() {
        return nazwisko + " " + imie + " " + wiek + " " + wzrost + "[cm] " + waga + "[kg]";
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getWaga() {
        return waga;
    }

    public int getWiek() {
        return wiek;
    }

    public int getWzrost() {
        return wzrost;
    }


}
