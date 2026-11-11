package variante.models;

import variante.abstractions.Menu;

public class LightMenu extends Menu {
    @Override
    public void afficherMenu() {
        System.out.println("[LIGHT MODE] Affichage d'un menu deroulant lumineux.");
    }
}
