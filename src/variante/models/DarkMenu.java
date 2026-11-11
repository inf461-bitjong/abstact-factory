package variante.models;

import variante.abstractions.Menu;

public class DarkMenu extends Menu {
    @Override
    public void afficherMenu() {
        System.out.println("[DARK MODE] Affichage d'un menu deroulant sombre.");
    }
}
