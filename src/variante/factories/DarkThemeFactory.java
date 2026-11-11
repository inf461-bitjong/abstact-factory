package variante.factories;

import variante.abstractions.Bouton;
import variante.abstractions.Menu;
import variante.abstractions.ThemeFactory;
import variante.models.DarkBouton;
import variante.models.DarkMenu;

public class DarkThemeFactory implements ThemeFactory {
    @Override
    public Bouton creerBouton() {
        return new DarkBouton();
    }

    @Override
    public Menu creerMenu() {
        return new DarkMenu();
    }
}
