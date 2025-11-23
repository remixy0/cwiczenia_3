package Zad5;

public class Hotel {
    Pokoj [] hotel;

    public Hotel(int n) {
        hotel = new Pokoj[n];
        for (int i = 0; i < n; i++) {
            hotel[i] = new Pokoj(i+1);
        }
    }

    public int znajdzWolnyPokoj(){
        for (int i = 0; i < hotel.length; i++) {
            if(!hotel[i].czyZajety()) return hotel[i].getNumer();
        }
        return -1;
    }

    public void wynajmijPokoj(Osoba osoba) {
        if (znajdzWolnyPokoj() != -1) {
            hotel[znajdzWolnyPokoj() - 1].wynajmijPokoj(osoba);
        }
    }

    public void ktoryPokojWynajmujeOsoba(Osoba osoba) {
        for (int i = 0; i < hotel.length; i++) {
            if (hotel[i].czyZajety()) {
                if(hotel[i].getKlient().equals(osoba)) {
                    System.out.println(hotel[i].getNumer());
                }
            }
        }
    }

    public void zwolnijPokojWynajmowanyPrzez(Osoba osoba) {
        for (int i = 0; i < hotel.length; i++) {
            if (hotel[i].czyZajety()) {
                if(hotel[i].getKlient().equals(osoba)) {
                    hotel[i].zwolnijPokoj();
                }
            }
        }
    }



}

class Pokoj{
    int numer;
    Osoba klient = null;
    boolean czyZajety = false;

    Pokoj(int n){
        numer = n;
    }

    public void wynajmijPokoj(Osoba osoba){
        if(!czyZajety){
            this.klient = osoba;
            czyZajety = true;
        }
    }

    public void zwolnijPokoj(){
        klient = null;
        czyZajety = false;
    }

    public boolean czyZajety(){
        return czyZajety;
    }

    public int getNumer(){
        return numer;
    }

    public Osoba getKlient(){
        return klient;
    }

    public void setNumer(int n){
        numer = n;
    }


}

class Osoba{
    String imie;
    String nazwisko;
    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie(String imie){
        return imie;
    }

    public String getNazwisko(String imie){
        return nazwisko;
    }

    public void setImie(String imie){
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString(){
        return imie + " " + nazwisko;
    }

    @Override
    public boolean equals(Object osoba){
        if(osoba == null) return false;
        if(osoba instanceof Osoba){
            Osoba o = (Osoba)osoba;
            if(this.toString().equals(o.toString())) return true;
            else return false;
        }
        return false;
    }


}
