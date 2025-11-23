package Zad5;

public class Zad5 {
    public static void main(String[] args) {

        Hotel hotel = new Hotel(10);
        Osoba osoba1 = new Osoba("Stanisław", "Sikora");

        System.out.println(hotel.znajdzWolnyPokoj());
        hotel.wynajmijPokoj(osoba1);
        hotel.wynajmijPokoj(osoba1);

        hotel.ktoryPokojWynajmujeOsoba(osoba1);




    }

}
