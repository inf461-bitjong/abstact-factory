package variante;

import variante.abstractions.Bouton;
import variante.abstractions.Menu;
import variante.abstractions.ThemeFactory;
import variante.factories.DarkThemeFactory;
import variante.factories.LightThemeFactory;

public class ClientVariante {
    public static void main(String[] args) {
        System.out.println("=== EXEMPLE MODIFIE : Abstract Factory (Themes UI) ===");

        ThemeFactory darkFactory = new DarkThemeFactory();
        Bouton darkBouton = darkFactory.creerBouton();
        Menu darkMenu = darkFactory.creerMenu();

        System.out.println("\nChargement du theme sombre :");
        darkBouton.afficherBouton();
        darkMenu.afficherMenu();

        ThemeFactory lightFactory = new LightThemeFactory();
        Bouton lightBouton = lightFactory.creerBouton();
        Menu lightMenu = lightFactory.creerMenu();

        System.out.println("\nChargement du theme clair :");
        lightBouton.afficherBouton();
        lightMenu.afficherMenu();
    }
}
