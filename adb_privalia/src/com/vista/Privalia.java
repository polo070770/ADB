package com.vista;

import com.controlador.Controller;
import com.model.Article;
import com.model.Campanya;
import com.model.Client;
import com.model.Dades_entrega;
import com.model.Familia;
import com.model.Linea_factura;
import com.model.Subfamilia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Privalia {

    private Controller ctrl;
    private Session session = null;
    private Transaction tx = null;

    static private enum OpcionsMenuPrincipal {

        OPT_FAMILIA, OPT_SUBFAMILIA, OPT_COMPANYIA, OPT_ARTICLE, OPT_CLIENT, OPT_DADES_ENTREGA, OPT_LINEA_FACTURA, SORTIR
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

    static private enum OpcionsClient {

        MENU_S5_CREATE, MENU_S5_READ, MENU_S5_UPDATE, MENU_S5_DELETE, MENU_S5_SORTIR
    };

    static private enum OpcionsDadesEntrega {

        MENU_S6_CREATE, MENU_S6_READ, MENU_S6_UPDATE, MENU_S6_DELETE, MENU_S6_SORTIR
    };

    static private enum OpcionsLineaFactura {

        MENU_S7_CREATE, MENU_S7_READ, MENU_S7_UPDATE, MENU_S7_DELETE, MENU_S7_SORTIR
    };

    static private String[] descMenuPrincipal = {"CRUD operations Familia", "CRUD operations Subfamilia", "CRUD operations Companyia",
        "CRUD operations Article", "CRUD operations Client", "CRUD operations Dades entrega", "CRUD operations Linea factura", "Sortir"};
    static private String[] descSubMenu1 = {"Create", "Read",
        "Update", "Delete", "Tornar al menú anterior"};
    static private String[] descSubMenu2 = {"Create", "Read",
        "Update", "Delete", "Tornar al menú anterior"};
    static private String[] descSubMenu3 = {"Create", "Read",
        "Update", "Delete", "Tornar al menú anterior"};
    static private String[] descSubMenu4 = {"Create", "Read",
        "Update", "Delete", "Tornar al menú anterior"};
    static private String[] descSubMenu5 = {"Create", "Read",
        "Update", "Delete", "Tornar al menú anterior"};
    static private String[] descSubMenu6 = {"Create", "Read",
        "Update", "Delete", "Tornar al menú anterior"};
    static private String[] descSubMenu7 = {"Create", "Read",
        "Update", "Delete", "Tornar al menú anterior"};

    public Privalia() {

        ctrl = new Controller();

        try {
            session = ConnectorHB.getSession();
            tx = session.beginTransaction();
        } catch (HibernateException e) {

            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        }

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
                case OPT_CLIENT:
                    gestioClient_CRUD(sc);
                    break;
                case OPT_DADES_ENTREGA:
                    gestioDadesEntrega_CRUD(sc);
                    break;
                case OPT_LINEA_FACTURA:
                    gestioLineaFactura_CRUD(sc);
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

    private void gestioClient_CRUD(Scanner sc) {

        // Creem l'objecte per al menú. Li passem com a primer paràmetre el nom del menú
        Menu<OpcionsClient> menu = new Menu<OpcionsClient>("crud operations for client", OpcionsClient.values());

        // Assignem la descripció de les opcions
        menu.setAccions(descSubMenu5);

        // Obtenim una opció des del menú i fem les accions pertinents
        OpcionsClient opcio = null;

        do {
            // Mostrem les opcions del menú
            menu.MostraMenu();

            // Demanem una opcio
            opcio = menu.getOpcio(sc);

            // Fem les accions necessàries
            switch (opcio) {
                case MENU_S5_CREATE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 1");
                    break;
                case MENU_S5_READ:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 2");

                    List<Linea_factura> listado = new ArrayList<Linea_factura>();
                    Query q = session.createQuery("from Linea_factura");
                    listado = q.list();

                    for (Linea_factura data : listado) {
                        System.out.println(data.getArticle().getColor());
                    }

                    break;
                case MENU_S5_UPDATE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 3");
                    break;
                case MENU_S5_DELETE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 4");
                    break;
                case MENU_S5_SORTIR:
                    System.out.println("Fins aviat!");
                    break;
            }

        } while (opcio != OpcionsClient.MENU_S5_SORTIR);

    }

    private void gestioDadesEntrega_CRUD(Scanner sc) {

        // Creem l'objecte per al menú. Li passem com a primer paràmetre el nom del menú
        Menu<OpcionsDadesEntrega> menu = new Menu<OpcionsDadesEntrega>("crud operations for dades entrega", OpcionsDadesEntrega.values());

        // Assignem la descripció de les opcions
        menu.setAccions(descSubMenu6);

        // Obtenim una opció des del menú i fem les accions pertinents
        OpcionsDadesEntrega opcio = null;

        do {
            // Mostrem les opcions del menú
            menu.MostraMenu();

            // Demanem una opcio
            opcio = menu.getOpcio(sc);

            // Fem les accions necessàries
            switch (opcio) {
                case MENU_S6_CREATE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 1");
                    break;
                case MENU_S6_READ:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 2");
                    break;
                case MENU_S6_UPDATE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 3");
                    break;
                case MENU_S6_DELETE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 4");
                    break;
                case MENU_S6_SORTIR:
                    System.out.println("Fins aviat!");
                    break;
            }

        } while (opcio != OpcionsDadesEntrega.MENU_S6_SORTIR);

    }

    private void gestioLineaFactura_CRUD(Scanner sc) {

        // Creem l'objecte per al menú. Li passem com a primer paràmetre el nom del menú
        Menu<OpcionsLineaFactura> menu = new Menu<OpcionsLineaFactura>("crud operations for linea factura", OpcionsLineaFactura.values());

        // Assignem la descripció de les opcions
        menu.setAccions(descSubMenu7);

        // Obtenim una opció des del menú i fem les accions pertinents
        OpcionsLineaFactura opcio = null;

        do {
            // Mostrem les opcions del menú
            menu.MostraMenu();

            // Demanem una opcio
            opcio = menu.getOpcio(sc);

            // Fem les accions necessàries
            switch (opcio) {
                case MENU_S7_CREATE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 1");
                    break;
                case MENU_S7_READ:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 2");
                    break;
                case MENU_S7_UPDATE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 3");
                    break;
                case MENU_S7_DELETE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 4");
                    break;
                case MENU_S7_SORTIR:
                    System.out.println("Fins aviat!");
                    break;
            }

        } while (opcio != OpcionsLineaFactura.MENU_S7_SORTIR);

    }

}
