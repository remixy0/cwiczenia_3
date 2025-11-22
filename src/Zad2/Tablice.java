package Zad2;

import java.util.Random;

public class Tablice {
    int kolumny;
    int wiersze;
    int [][] tablica;
     public Tablice(int kolumny, int wiersze) {
         this.kolumny = kolumny;
         this.wiersze = wiersze;
         tablica = new int [wiersze][kolumny];
     }

     public void uzupelnij(int z){
         Random rand = new Random();
         for(int i = 0; i < wiersze; i++){
             for(int j = 0; j < kolumny; j++){
                 tablica[i][j]=rand.nextInt(z);
             }
         }
     }

     public void wyswietl(){
         for(int i = 0; i < wiersze; i++){
             for(int j = 0; j < kolumny; j++){
                 System.out.print(tablica[i][j] + " ");
             }
             System.out.println();
         }
     }

     public double sredniaKolumny(int kolumna){
         double suma = 0;
         for (int i = 0; i < wiersze; i++){
             suma += tablica[i][kolumna-1];
         }
         return suma/wiersze;
     }

     public void tablicaSrednich(){
         for(int i = 0; i < kolumny; i++){
             System.out.print(sredniaKolumny(i+1) + " ");
         }
     }
}
