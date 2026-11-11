package variante.models;

import variante.abstractions.Bouton;

public class DarkBouton extends Bouton {
    @Override
    public void afficherBouton() {
        System.out.println("[DARK MODE] Affichage d'un bouton sombre (fond gris fonce, texte blanc).");
    }
}
