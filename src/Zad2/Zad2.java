package Zad2;

public class Zad2 {
    public static void main(String[] args) {
        Tablice tablica = new Tablice(4,5);
        tablica.uzupelnij(10);
        tablica.wyswietl();
        System.out.println(tablica.sredniaKolumny(2));
        tablica.tablicaSrednich();
    }
}
