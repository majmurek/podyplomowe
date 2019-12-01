package com.company;

import java.util.StringTokenizer;

public class Lab6 {
    public static void main(String[] args) {

        StringTokenizer st;

        String quote = "29&04&2016";
        st = new StringTokenizer(quote ,"&");
        System.out.println("Dzień: " + st.nextToken());
        System.out.println("Miesiąc: " + st.nextToken());
        System.out.println("Rok: " + st.nextToken());
    }
}