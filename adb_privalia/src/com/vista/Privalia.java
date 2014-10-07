package com.vista;

/**
 *
 * @author maikell
 */
import java.util.Scanner;

/**
 * Classe que gestiona totes les opcions del nostre menú reproductor.
 *
 * @author Maikel
 */
public class Privalia {

    static private enum OpcionsMenuPrincipal {

        OPT_FAMILIA, OPT_SUBFAMILIA, OPT_COMPANYIA, OPT_ARTICLE, SORTIR
    };

    static private enum OpcionsFamilia {

        MENU_S1_CREATE, MENU_S1_READ, MENU_S1_UPDATE, MENU_S1_DELETE, MENU_S1_SORTIR
    };

    static private enum OpcionsSubfamilia {

        MENU_S2_CREATE, MENU_S2_READ, MENU_S2_UPDATE, MENU_S2_DELETE, MENU_S2_SORTIR
    };

    static private enum OpcionsCompanyia {

        MENU_S3_CREATE, MENU_S3_READ, MENU_S3_UPDATE, MENU_S3_DELETE, MENU_S3_SORTIR
    };

    static private enum OpcionsArticle {

        MENU_S4_CREATE, MENU_S4_READ, MENU_S4_UPDATE, MENU_S4_DELETE, MENU_S4_SORTIR
    };
    static private String[] descMenuPrincipal = {"CRUD operations Familia", "CRUD operations Subfamilia", "CRUD operations Companyia",
        "CRUD operations Article", "Sortir"};
    static private String[] descSubMenu1 = {"Create", "Read",
        "Update", "Delete", "Tornar al menú anterior"};
    static private String[] descSubMenu2 = {"Create", "Read",
        "Update", "Delete", "Tornar al menú anterior"};
    static private String[] descSubMenu3 = {"Create", "Read",
        "Update", "Delete", "Tornar al menú anterior"};
    static private String[] descSubMenu4 = {"Create", "Read",
        "Update", "Delete", "Tornar al menú anterior"};

    public Privalia() {

    }

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        Privalia priv = new Privalia();

        priv.gestioMenuPrincipal(sc);

    }

    private void gestioMenuPrincipal(Scanner sc) {

        Menu<OpcionsMenuPrincipal> menu = new Menu<OpcionsMenuPrincipal>("Menu Principal", OpcionsMenuPrincipal.values());

        menu.setAccions(descMenuPrincipal);

        OpcionsMenuPrincipal opcio = null;
        do {
            menu.MostraMenu();

            opcio = menu.getOpcio(sc);

            switch (opcio) {

                case OPT_FAMILIA:
                    gestioFamilia_CRUD(sc);
                    break;
                case OPT_SUBFAMILIA:
                    gestioSubfamilia_CRUD(sc);
                    break;
                case OPT_COMPANYIA:
                    gestioCompanyia_CRUD(sc);
                    break;
                case OPT_ARTICLE:
                    gestioArticle_CRUD(sc);
                    break;
                case SORTIR:
                    System.out.println("");
                    break;
            }

        } while (opcio != OpcionsMenuPrincipal.SORTIR);
    }

    private void gestioFamilia_CRUD(Scanner sc) {

        Menu<OpcionsFamilia> menu = new Menu<OpcionsFamilia>("crud operations for familia", OpcionsFamilia.values());

        menu.setAccions(descSubMenu1);

        OpcionsFamilia opcio = null;
        do {
            menu.MostraMenu();

            opcio = menu.getOpcio(sc);

            switch (opcio) {
                case MENU_S1_CREATE:
                    System.out.println("Has triat la opció 1");
                    break;
                case MENU_S1_READ:
                    System.out.println("Has triat la opció 2");
                    break;
                case MENU_S1_UPDATE:
                    System.out.println("Has triat la opció 3");
                    break;
                case MENU_S1_DELETE:
                    System.out.println("Has triat la opció 3");
                    break;
                case MENU_S1_SORTIR:
                    System.out.println("Fins aviat!");
                    break;
            }

        } while (opcio != OpcionsFamilia.MENU_S1_SORTIR);
    }

    private void gestioSubfamilia_CRUD(Scanner sc) {

        Menu<OpcionsSubfamilia> menu = new Menu<OpcionsSubfamilia>("crud operations for subfamilia", OpcionsSubfamilia.values());

        menu.setAccions(descSubMenu2);

        OpcionsSubfamilia opcio = null;
        do {
            menu.MostraMenu();

            opcio = menu.getOpcio(sc);

            switch (opcio) {
                case MENU_S2_CREATE:
                    System.out.println("Has triat la opció 1");
                    break;
                case MENU_S2_READ:
                    System.out.println("Has triat la opció 2");
                    break;
                case MENU_S2_UPDATE:
                    System.out.println("Has triat la opció 3");
                    break;
                case MENU_S2_DELETE:
                    System.out.println("Has triat la opció 4");
                    break;
                case MENU_S2_SORTIR:
                    System.out.println("Fins aviat!");
                    break;
            }

        } while (opcio != OpcionsSubfamilia.MENU_S2_SORTIR);
    }

    private void gestioCompanyia_CRUD(Scanner sc) {
        Menu<OpcionsCompanyia> menu = new Menu<OpcionsCompanyia>("crud operations for companyia", OpcionsCompanyia.values());

        menu.setAccions(descSubMenu3);

        OpcionsCompanyia opcio = null;

        do {
            // Mostrem les opcions del menú
            menu.MostraMenu();

            // Demanem una opcio
            opcio = menu.getOpcio(sc);

            // Fem les accions necessàries
            switch (opcio) {
                case MENU_S3_CREATE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 1");
                    break;
                case MENU_S3_READ:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 2");
                    break;
                case MENU_S3_UPDATE:
                    System.out.println("Has triat la opció 3");
                    break;
                case MENU_S3_DELETE:
                    System.out.println("Has triat la opció 4");
                    break;
                case MENU_S3_SORTIR:
                    System.out.println("Fins aviat!");
                    break;
            }

        } while (opcio != OpcionsCompanyia.MENU_S3_SORTIR);

    }

    private void gestioArticle_CRUD(Scanner sc) {

        // Creem l'objecte per al menú. Li passem com a primer paràmetre el nom del menú
        Menu<OpcionsArticle> menu = new Menu<OpcionsArticle>("crud operations for article", OpcionsArticle.values());

        // Assignem la descripció de les opcions
        menu.setAccions(descSubMenu4);

        // Obtenim una opció des del menú i fem les accions pertinents
        OpcionsArticle opcio = null;

        do {
            // Mostrem les opcions del menú
            menu.MostraMenu();

            // Demanem una opcio
            opcio = menu.getOpcio(sc);

            // Fem les accions necessàries
            switch (opcio) {
                case MENU_S4_CREATE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 1");
                    break;
                case MENU_S4_READ:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 2");
                    break;
                case MENU_S4_UPDATE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 3");
                    break;
                case MENU_S4_DELETE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 4");
                    break;
                case MENU_S4_SORTIR:
                    System.out.println("Fins aviat!");
                    break;
            }

        } while (opcio != OpcionsArticle.MENU_S4_SORTIR);

    }

}
