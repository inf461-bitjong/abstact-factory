package cours;

import cours.abstractions.IProduitFactory;
import cours.abstractions.ProduitA;
import cours.abstractions.ProduitB;
import cours.factories.ProduitFactory1;
import cours.factories.ProduitFactory2;

public class Client {
    public static void main(String[] args) {
        IProduitFactory produitFactory1 = new ProduitFactory1();
        IProduitFactory produitFactory2 = new ProduitFactory2();

        System.out.println("--- Utilisation de la premiere fabrique (Famille 1) ---");
        ProduitA produitA = produitFactory1.getProduitA();
        ProduitB produitB = produitFactory1.getProduitB();
        produitA.methodeA();
        produitB.methodeB();

        System.out.println("\n--- Utilisation de la seconde fabrique (Famille 2) ---");
        produitA = produitFactory2.getProduitA();
        produitB = produitFactory2.getProduitB();
        produitA.methodeA();
        produitB.methodeB();
    }
}
