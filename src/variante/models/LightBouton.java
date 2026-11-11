package variante.models;

import variante.abstractions.Bouton;

public class LightBouton extends Bouton {
    @Override
    public void afficherBouton() {
        System.out.println("[LIGHT MODE] Affichage d'un bouton lumineux (fond blanc, texte noir).");
    }
}
