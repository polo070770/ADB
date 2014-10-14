package com.vista;

import com.controlador.Controller;
import com.model.Article;
import com.model.Campanya;
import com.model.Client;
import com.model.Dades_entrega;
import com.model.Familia;
import com.model.Linea_factura;
import com.model.Producte;
import com.model.Subfamilia;
import java.sql.Date;
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

    static private enum OpcionsMenuPrincipal {

        OPT_FAMILIA, OPT_SUBFAMILIA, OPT_COMPANYA, OPT_ARTICLE, OPT_CLIENT, OPT_DADES_ENTREGA, OPT_LINEA_FACTURA, SORTIR
    };

    static private enum OpcionsFamilia {

        MENU_S1_CREATE, MENU_S1_READ, MENU_S1_UPDATE, MENU_S1_DELETE, MENU_S1_SORTIR
    };

    static private enum OpcionsSubfamilia {

        MENU_S2_CREATE, MENU_S2_READ, MENU_S2_UPDATE, MENU_S2_DELETE, MENU_S2_SORTIR
    };

    static private enum OpcionsCompanya {

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

    static private String[] descMenuPrincipal = {"CRUD operations Familia", "CRUD operations Subfamilia", "CRUD operations Companya",
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

        } catch (HibernateException e) {

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
                case OPT_COMPANYA:
                    gestioCompanya_CRUD(sc);
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
                    session.close();
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
                    createFamilia(sc);
                    break;
                case MENU_S1_READ:
                    System.out.println("Has triat la opció 2");
                    readFamilia(sc);
                    break;
                case MENU_S1_UPDATE:
                    System.out.println("Has triat la opció 3");
                    updateFamilia(sc);
                    break;
                case MENU_S1_DELETE:
                    System.out.println("Has triat la opció 3");
                    deleteFamilia(sc);
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
                    createSubfamilia(sc);
                    break;
                case MENU_S2_READ:
                    System.out.println("Has triat la opció 2");
                    readSubfamilia(sc);
                    break;
                case MENU_S2_UPDATE:
                    System.out.println("Has triat la opció 3");
                    updateSubfamilia(sc);
                    break;
                case MENU_S2_DELETE:
                    System.out.println("Has triat la opció 4");
                    deleteSubfamilia(sc);
                    break;
                case MENU_S2_SORTIR:
                    System.out.println("Fins aviat!");
                    break;
            }

        } while (opcio != OpcionsSubfamilia.MENU_S2_SORTIR);
    }

    private void gestioCompanya_CRUD(Scanner sc) {
        Menu<OpcionsCompanya> menu = new Menu<OpcionsCompanya>("crud operations for companya", OpcionsCompanya.values());

        menu.setAccions(descSubMenu3);

        OpcionsCompanya opcio = null;

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
                    createCampanya(sc);
                    break;
                case MENU_S3_READ:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 2");
                    readCampanya(sc);
                    break;
                case MENU_S3_UPDATE:
                    System.out.println("Has triat la opció 3");
                    updateCampanya(sc);
                    break;
                case MENU_S3_DELETE:
                    System.out.println("Has triat la opció 4");
                    deleteCampanya(sc);
                    break;
                case MENU_S3_SORTIR:
                    System.out.println("Fins aviat!");
                    break;
            }

        } while (opcio != OpcionsCompanya.MENU_S3_SORTIR);

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
                    createArticle(sc);
                    break;
                case MENU_S4_READ:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 2");
                    readArticle(sc);
                    break;
                case MENU_S4_UPDATE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 3");
                    updateArticle(sc);
                    break;
                case MENU_S4_DELETE:
                    deleteArticle(sc);
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
                    createClient(sc);
                    break;
                case MENU_S5_READ:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 2");
                    readClient(sc);
                    break;
                case MENU_S5_UPDATE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 3");
                    updateClient(sc);
                    break;
                case MENU_S5_DELETE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 4");
                    deleteClient(sc);
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
                    createDadesEntrega(sc);
                    break;
                case MENU_S6_READ:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 2");
                    readDadesEntrega(sc);
                    break;
                case MENU_S6_UPDATE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 3");
                    updateDadesEntrega(sc);
                    break;
                case MENU_S6_DELETE:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opció 4");
                    deleteDadesEntrega(sc);
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

    private void createFamilia(Scanner sc) {

        Transaction tx = session.beginTransaction();

        System.out.println("\n-Nom de la familia?");
        String nom = sc.nextLine();
        Familia f = new Familia();
        f.setNom(nom);

        session.save(f);
        tx.commit();

    }

    private void readFamilia(Scanner sc) {

        Transaction tx = session.beginTransaction();

        System.out.println("\n-Registres de familia: ");

        List<Familia> listado = new ArrayList<Familia>();
        Query q = session.createQuery("from Familia");
        listado = q.list();

        System.out.println("id_familia\tnom_familia");
        System.out.println("-----------------");
        for (Familia f : listado) {
            System.out.println(f.getId_familia() + "\t\t" + f.getNom());
        }
        tx.commit();

    }

    private void updateFamilia(Scanner sc) {

        readFamilia(sc);

        Transaction tx = session.beginTransaction();

        System.out.println("\nQuina familia vols actualitzar? (inserta id)");
        int id = sc.nextInt();

        Familia f = (Familia) session.get(Familia.class, id);

        System.out.println("\nIntrodueix nou nom per aquesta familia:");
        String nom = sc.next();
        f.setNom(nom);
        session.update(f);
        tx.commit();

    }

    private void deleteFamilia(Scanner sc) {

        readFamilia(sc);

        Transaction tx = session.beginTransaction();

        System.out.println("\nQuina familia vols eliminar? (inserta id)");
        int id = sc.nextInt();

        Familia f = (Familia) session.get(Familia.class, id);
        session.delete(f);
        tx.commit();
    }

    private void createSubfamilia(Scanner sc) {

        Transaction tx = session.beginTransaction();

        System.out.println("\n-Nom de la subfamilia?");
        String nom = sc.nextLine();
        Subfamilia sf = new Subfamilia();
        sf.setNom(nom);

        int sexo;
        System.out.println("\nPertant a home o dona?(h=1/d=2)");
        sexo = sc.nextInt();
        Familia f = (Familia) session.get(Familia.class, sexo);
        session.getTransaction().commit();
        sf.setFamilia(f);

        session.save(sf);
        tx.commit();
    }

    private void readSubfamilia(Scanner sc) {

        Transaction tx = session.beginTransaction();

        System.out.println("\nRegistres de subfamilia: ");

        List<Subfamilia> listado = new ArrayList<Subfamilia>();
        Query q = session.createQuery("from Subfamilia");
        listado = q.list();

        System.out.println("id_subfamilia\tnom_subfamilia\tnom_familia");
        System.out.println("-----------------------------");
        for (Subfamilia sf : listado) {
            System.out.println(sf.getId_subfamilia() + "\t\t" + sf.getNom() + "\t\t" + sf.getFamilia().getNom());
        }
        tx.commit();

    }

    private void updateSubfamilia(Scanner sc) {

        readSubfamilia(sc);

        Transaction tx = session.beginTransaction();

        System.out.println("\nQuina subfamilia vols actualitzar? (inserta id)");
        int id = sc.nextInt();

        Subfamilia sf = (Subfamilia) session.get(Subfamilia.class, id);

        System.out.println("\nIntrodueix nou nom per aquesta subfamilia:");
        String nom = sc.next();
        sf.setNom(nom);
        session.update(sf);
        tx.commit();

    }

    private void deleteSubfamilia(Scanner sc) {

        readSubfamilia(sc);

        Transaction tx = session.beginTransaction();

        System.out.println("\nQuina subfamilia vols eliminar? (inserta id)");
        int id = sc.nextInt();

        Subfamilia sf = (Subfamilia) session.get(Subfamilia.class, id);
        session.delete(sf);
        tx.commit();

    }

    private void createCampanya(Scanner sc) {

        Transaction tx = session.beginTransaction();

        System.out.println("\n-Nom de la campanya?");
        String nom = sc.nextLine();

        System.out.println("\n-Nom de la marca?");
        String marca = sc.nextLine();

        System.out.println("\n-Data d'inici? (yyyy-mm-dd)");
        String data_i = sc.nextLine();

        System.out.println("\n-Data de fi? (yyyy-mm-dd)");
        String data_f = sc.nextLine();

        Campanya c = new Campanya();
        c.setNom(nom);
        c.setMarca(marca);

        c.setData_inici(Date.valueOf(data_i));
        c.setData_fi(Date.valueOf(data_f));

        session.save(c);
        tx.commit();

    }

    private void readCampanya(Scanner sc) {

        Transaction tx = session.beginTransaction();

        System.out.println("\nRegistres de campanya: ");

        List<Campanya> listado = new ArrayList<Campanya>();
        Query q = session.createQuery("from Campanya");
        listado = q.list();

        System.out.println("id_campanya\tnom_campanya");
        System.out.println("-----------------------------");
        for (Campanya c : listado) {
            System.out.println(c.getId_campanya() + "\t\t" + c.getNom());
        }
        tx.commit();

    }

    private void updateCampanya(Scanner sc) {

        readCampanya(sc);

        Transaction tx = session.beginTransaction();

        System.out.println("\nQuina campanya vols actualitzar? (inserta id)");
        int id = sc.nextInt();

        Campanya c = (Campanya) session.get(Campanya.class, id);

        System.out.println("\nIntrodueix nou nom per aquesta campanya:");
        String nom = sc.next();
        c.setNom(nom);
        session.update(c);
        tx.commit();

    }

    private void deleteCampanya(Scanner sc) {

        readCampanya(sc);

        Transaction tx = session.beginTransaction();

        System.out.println("\nQuina campanya vols eliminar? (inserta id)");
        int id = sc.nextInt();

        Campanya c = (Campanya) session.get(Campanya.class, id);
        session.delete(c);
        tx.commit();

    }

    private void createArticle(Scanner sc) {

        System.out.println("\n-Quin nom?");
        String nom = sc.next();

        System.out.println("\n-Quina marca?");
        String marca = sc.next();

        System.out.println("\n-Quantitat d'articles?");
        int quantitat = sc.nextInt();

        System.out.println("\n-Quina talla?");
        double talla = sc.nextDouble();

        System.out.println("\n-Quin color?");
        String color = sc.next();

        System.out.println("\n-Quin preu?");
        double preu = sc.nextFloat();

        readSubfamilia(sc);
        System.out.println("\n-A quina subfamilia pertany? (introdueix id)");
        int id_s = sc.nextInt();
        Subfamilia s = (Subfamilia) session.get(Subfamilia.class, id_s);

        readCampanya(sc);
        System.out.println("\n-A quina campanya pertany? (introdueix id)");
        int id_c = sc.nextInt();
        Campanya c = (Campanya) session.get(Campanya.class, id_c);

        Transaction tx = session.beginTransaction();

        Article a = new Article();
        a.setNom(nom);
        a.setMarca(marca);
        a.setNum_articles(quantitat);
        a.setTalla(talla);
        a.setColor(color);
        a.setPreu(preu);
        a.setSubfamilia(s);
        a.setCampanya(c);

        session.save(a);
        tx.commit();

    }

    private void readArticle(Scanner sc) {

        Transaction tx = session.beginTransaction();

        System.out.println("\nRegistres de articles: ");

        List<Article> listado = new ArrayList<Article>();
        Query q = session.createQuery("from Article");
        listado = q.list();

        System.out.println("id\ttalla\tcolor\tpreu");
        System.out.println("-----------------------------");
        for (Article a : listado) {
            System.out.println(a.getProducte().getId_producte()
                    + "\t" + a.getTalla() + "\t"
                    + a.getColor() + "\t" + a.getPreu());
        }
        tx.commit();

    }

    private void updateArticle(Scanner sc) {

        readArticle(sc);

        Transaction tx = session.beginTransaction();

        System.out.println("\nQuin article vols actualitzar? (inserta id)");
        int id = sc.nextInt();

        Article a = (Article) session.get(Article.class, id);

        System.out.println("\nIntrodueix nou color:");
        String color = sc.next();
        a.setColor(color);
        session.update(a);
        tx.commit();

    }

    private void deleteArticle(Scanner sc) {

        readArticle(sc);

        Transaction tx = session.beginTransaction();

        System.out.println("\nQuin article vols eliminar? (inserta id)");
        int id = sc.nextInt();

        Article a = (Article) session.get(Article.class, id);
        session.delete(a);
        tx.commit();

    }

    private void createClient(Scanner sc) {

        System.out.println("Quin es l'email?");
        String email = sc.next();
        System.out.println("Quin es el nom?");
        String nom = sc.next();
        System.out.println("Quin es el cognom?");
        String cognom = sc.next();
        System.out.println("Quin es el telefon");
        String telefon = sc.next();

        Transaction tx = session.beginTransaction();

        Client c = new Client();
        c.setEmail(email);
        c.setNom(nom);
        c.setCognom(cognom);
        c.setTelefon(telefon);

        session.save(c);
        tx.commit();

    }

    private void readClient(Scanner sc) {

        Transaction tx = session.beginTransaction();

        System.out.println("\nRegistres de Clients: ");

        List<Client> listado = new ArrayList<Client>();
        Query q = session.createQuery("from Client");
        listado = q.list();

        System.out.println("id\temail\tnom\tcognom\ttelefon");
        System.out.println("-----------------------------");
        for (Client c : listado) {
            System.out.println(c.getEmail() + "\t" + c.getNom() + "\t"
                    + c.getCognom() + "\t" + c.getTelefon());
        }
        tx.commit();

    }

    private void updateClient(Scanner sc) {

        readClient(sc);

        Transaction tx = session.beginTransaction();

        System.out.println("\nQuin Client vols actualitzar? (inserta id)");
        String id = sc.next();

        Client c = (Client) session.get(Client.class, id);

        System.out.println("\nIntrodueix nou nom:");
        String nom = sc.next();
        c.setNom(nom);
        session.update(c);
        tx.commit();

    }

    private void deleteClient(Scanner sc) {

        readClient(sc);

        Transaction tx = session.beginTransaction();

        System.out.println("\nQuin client vols eliminar? (inserta id)");
        String id = sc.next();

        Client c = (Client) session.get(Client.class, id);
        session.delete(c);
        tx.commit();

    }

    private void createDadesEntrega(Scanner sc) {

        System.out.println("Quin es el carrer?");
        String carrer = sc.next();
        System.out.println("Quina es la ciutat?");
        String ciutat = sc.next();
        System.out.println("Quina es la comunitat?");
        String comunitat = sc.next();
        System.out.println("Quin es el codi postal?");
        String codi_postal = sc.next();
        System.out.println("Quin es el pais?");
        String pais = sc.next();

        readClient(sc);
        System.out.println("A quin client pertany? (Introduiex l'id) ");
        String id = sc.next();
        Client c = (Client) session.get(Client.class, id);

        Transaction tx = session.beginTransaction();

        Dades_entrega d = new Dades_entrega();
        d.setCarrer(carrer);
        d.setCiutat(ciutat);
        d.setComunitat(comunitat);
        d.setCodi_postal(codi_postal);
        d.setPais(pais);
        d.setClient(c);

        session.save(d);
        tx.commit();

    }

    private void readDadesEntrega(Scanner sc) {

        Transaction tx = session.beginTransaction();

        System.out.println("\nRegistres de Dades de entrega: ");

        List<Dades_entrega> listado = new ArrayList<Dades_entrega>();
        Query q = session.createQuery("from Dades_entrega");
        listado = q.list();

        System.out.println("id\tciutat\tpais");
        System.out.println("-----------------------------");
        for (Dades_entrega d : listado) {
            System.out.println(d.getId_dades_entrega() + "\t" + d.getCiutat()
                    + "\t" + d.getPais());;
        }
        tx.commit();

    }

    private void updateDadesEntrega(Scanner sc) {

        readDadesEntrega(sc);

        Transaction tx = session.beginTransaction();

        System.out.println("\nQuina dada d'entrega vols actualitzar? (inserta id)");
        int id = sc.nextInt();

        Dades_entrega d = (Dades_entrega) session.get(Dades_entrega.class, id);

        System.out.println("\nIntrodueix nou nom del carrer:");
        String carrer = sc.next();
        d.setCarrer(carrer);
        session.update(d);
        tx.commit();

    }

    private void deleteDadesEntrega(Scanner sc) {

        readDadesEntrega(sc);

        Transaction tx = session.beginTransaction();

        System.out.println("\nQuina dada d'entrega vols eliminar? (inserta id)");
        int id = sc.nextInt();

        Dades_entrega d = (Dades_entrega) session.get(Dades_entrega.class, id);
        session.delete(d);
        tx.commit();

    }

}
