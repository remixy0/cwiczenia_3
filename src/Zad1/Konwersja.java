package Zad1;

public class Konwersja {

    public static int konerwsja(String liczba) {
        int liczbaDziesietna = 0;
        int mnoznik = -1;
        for (int i = liczba.length() -1 ; i >= 0; i--) {
            mnoznik++;
            System.out.println(liczba.charAt(i) + "   "  +Math.pow(16, mnoznik));
            switch (liczba.charAt(i)){
                case 'A':
                    liczbaDziesietna += 10 * Math.pow(16, mnoznik);
                    break;
                case 'B':
                    liczbaDziesietna += 11 * Math.pow(16, mnoznik);
                    break;
                case 'C':
                    liczbaDziesietna += 12 * Math.pow(16, mnoznik);
                    break;
                case 'D':
                    liczbaDziesietna += 13 * Math.pow(16, mnoznik);
                    break;
                case 'E':
                    liczbaDziesietna += 14 * Math.pow(16, mnoznik);
                    break;
                case 'F':
                    liczbaDziesietna += 15 * Math.pow(16, mnoznik);
                    break;
                default:
                    liczbaDziesietna += Character.getNumericValue(liczba.charAt(i)) * Math.pow(16, mnoznik);
                    break;


            }
        }
        return liczbaDziesietna;
    }



}
