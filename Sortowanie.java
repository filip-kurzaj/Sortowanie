package com.company;

import java.util.Random;
import java.util.Scanner;

public class Sortowanie {
    static void bubbleSortRosnaco(int[] tab,int ilosc,int wybor_sortowania) {
        for (int i = 1; i < ilosc; i++) {
            for (int j = 0; j < ilosc - 1; j++) {
                if (wybor_sortowania == 1) {
                    if (tab[j] > tab[j + 1]) {
                        int bufor = tab[j];
                        tab[j] = tab[j + 1];
                        tab[j + 1] = bufor;
                    }
                }
                if(wybor_sortowania== 2) {
                    if (tab[j] < tab[j + 1]) {
                        int bufor = tab[j];
                        tab[j] = tab[j + 1];
                        tab[j + 1] = bufor;
                    }
                }
            }
        }
    }
    public static void main (String[]args){

            Scanner scan = new Scanner(System.in);
            Random losowa = new Random();

        System.out.println("Sortowanie liczb: ");
        System.out.println("1. Rosnaco");
        System.out.println("2. Malejaco");

        int wybor_sortowania=scan.nextInt();
        while(wybor_sortowania!=1 && wybor_sortowania!=2)
        {

            System.out.println("Zla wartosc!");
            System.out.println("Sortowanie liczb: ");
            System.out.println("1. Rosnaco");
            System.out.println("2. Malejaco");
            wybor_sortowania=scan.nextInt();
        }

            System.out.println("Podaj ilosc liczb do wylosowania, losowane liczby 0-150: ");
            int ilosc = scan.nextInt();

            while(ilosc==0 || ilosc==1){

                if(ilosc==0) {
                System.out.println("Niepoprawna wartosc");
                }

                System.out.println("1. Podaj ilosc liczb do wylosowania, losowane liczby 0-150: ");
                System.out.println("2. Zakoncz program");

                int wybor_menu = scan.nextInt();
                switch (wybor_menu) {

                    case 1:
                        System.out.println("Podaj ilosc liczb do wylosowania: ");
                        ilosc = scan.nextInt();
                        break;

                    case 2:
                        System.out.println("SEE YOU NEXT TIME!");
                        return;
                }
            }

                System.out.println("Losowe liczby zbioru: ");
            int[] tab = new int[ilosc];

            for (int k = 0; k < ilosc; k++) {
                tab[k] = losowa.nextInt(151);
                System.out.print("("+tab[k]+")"+"=>");
            }

        System.out.println();

                    bubbleSortRosnaco(tab, ilosc,wybor_sortowania);

        System.out.println("Liczby po sortowaniu: ");
            for (int i = 0; i < ilosc; i++) {
                if(i==ilosc-1)
                {
                    System.out.print("("+tab[i]+")");
                }
                else
                {
                    System.out.print("("+tab[i]+")"+"=>");
                }
            }

    }
}
// Filip Kurzaj numer albumu: 102520