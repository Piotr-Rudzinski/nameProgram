package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj liczbę imion: ");
        Integer number = scanner.nextInt();
        String[] table = new String[number];
        System.out.println("");


/*        String[] table = new String[6];
        table[0] = "ola";
        table[1] = "tolek";
        table[2] = "marian";
        table[3] = "stefania";
        table[4] = "ola";
        table[5] = "ola";*/


        Scanner scanner2 = new Scanner(System.in);

        for (int i = 0; i < number; i++) {
            System.out.print("Podaj imię: ");
            String strIn = scanner2.nextLine();
            table[i] = strIn;
        }



        Integer namePosition = 0;
        Integer nameDl = 0;

        for (int i = 0; i < table.length; i++) {
            String name = table[i];

            if (name.length() > nameDl) {
                nameDl = name.length();
                namePosition = i;
            }
        }

        System.out.println("Najdłuższe imię: " + table[namePosition]);


        for (int i = 0; i < table.length; i++) {
            String name = table[i];

            if (name.length() < nameDl) {
                nameDl = name.length();
                namePosition = i;
            }
        }

        System.out.println("Najkrótsz imię: " + table[namePosition]);


        for (int i = 0; i < table.length; i++) {
//            System.out.println(table[i] + " *");
        }



        Integer[] duplicate = new Integer[table.length];
        for (int i = 0; i < duplicate.length; i++) {
            duplicate[i] = 0;
        }

        for (int i = 0; i < table.length; i++) {
            String compareStr = table[i];


                for (int j = i; j < table.length; j++) {
                    String compareStrNew = table[j];

//                    System.out.println(compareStr + "   " + compareStrNew + "   ");


                        if ((compareStr.equals(compareStrNew))) {
                            Integer size = duplicate[i];
                            size++;
                            duplicate[i] = size;

                            if (i != j) {
                                duplicate[j] = -5 - table.length;
                            }

//                            System.out.println(size);
                        }
                }

        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Powtarzające się imiona: ");

        System.out.println(" "); //---------------------------------
        for (int i = 0; i < duplicate.length; i++) {

            Integer sizeName = duplicate[i];
            if (sizeName > 1) {
                String nameTab = table[i];
                stringBuilder.append(nameTab);
                stringBuilder.append("(");
                stringBuilder.append(sizeName);
                stringBuilder.append("), ");
            }



 //           System.out.println(duplicate[i]);
        }

        System.out.println(stringBuilder);

    }
}
