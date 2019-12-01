package com.company;
import java.util.Scanner;

public class Macierz {
    public static void main(String[] args) {
        int n = 20;

        for (int j = 0; j <= n; j++) {

            for (int i = 1; i <= n; i++) {
                System.out.printf("%2s", i + j + " ");
            }
            System.out.println();
        }
    }
}

