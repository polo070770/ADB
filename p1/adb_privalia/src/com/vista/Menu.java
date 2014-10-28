package com.vista;

import java.util.Scanner;

public class Menu<TEnum> {

    TEnum[] llistaOpcions = null;
    String titol = "";
    String[] accionsOpcions = null;

    public Menu(String titol, TEnum[] llistaOpcions) {

        this.titol = titol;
        this.llistaOpcions = llistaOpcions;

    }

    public void setAccions(String[] accionsOpcions) {
        this.accionsOpcions = accionsOpcions;
    }

    public void MostraMenu() {
        // Mostrem les opcions
        String lines = "--------------";
        for (int i = 0; i < getMaxLen(); i++) {
            lines += "-";
        }
        System.out.println(lines);
        System.out.println(titol.toUpperCase());
        System.out.println(lines);
        for (TEnum c : llistaOpcions) {

            // Mostrem la posició
            int pos = ((Enum) c).ordinal();
            System.out.print("\t" + (pos + 1) + ".- ");

            // Mostrem la descripció
            if (accionsOpcions != null) {
                System.out.println(accionsOpcions[pos]);
            } else {
                System.out.println(c);
            }
        }
        System.out.println(lines);
    }

    public TEnum getOpcio(Scanner sc) {
        TEnum opcio = null;

        // Demanem una opció assegurant que sigui correcta
        int opcioInt = -1;
        do {
            System.out.print("Entra una opcio >> ");
            while (!sc.hasNextInt()) {
                System.out.println("Format d'opció Incorrecte(té que ser un un numero)");
                System.out.print(">> ");
                sc.nextLine();
            }
            opcioInt = sc.nextInt();
            sc.nextLine();
            if (opcioInt > 0 && opcioInt <= llistaOpcions.length) {
                // Passem de l'enter a una opcio i la retornem
                opcio = llistaOpcions[opcioInt - 1];
            } else {
                System.err.println("La opció seleccionada no és correcta. Selecciona una opció entre 1 i " + (llistaOpcions.length));
            }
        } while (opcio == null);
        return opcio;
    }

    private int getMaxLen() {
        int maxLen = 0;

        for (TEnum c : llistaOpcions) {

            // Obtenim la posició
            int pos = ((Enum) c).ordinal();

            // Mostrem la descripció
            if (accionsOpcions != null) {
                maxLen = Math.max(maxLen, accionsOpcions[pos].length());
            } else {
                maxLen = Math.max(maxLen, c.toString().length());
            }
        }
        return maxLen;
    }
}
