package Zad4;

public class Liczby {
    public static boolean czyNieparzysta(int liczba){
        if (liczba % 2 == 1) return true;
        else return false;
    }

    public static boolean wyswietlLiczbyNieparzyste(int start, int koniec){
        if(start >= koniec){
            System.out.println("nieprawidłowe dane");
            return false;
        }
        int ilosc = 0;
        int iloscWlini = 0;
        for (int i = start; i <= koniec; i++){
            if(czyNieparzysta(i)) {
                System.out.print(i + " ");
                ilosc++;
                iloscWlini++;
            }
            if(iloscWlini == 10){
                iloscWlini = 0;
                System.out.println("");
            }
        }
        System.out.println("ilosc liczb: " + ilosc);
        return true;
    }



}
