package variante.factories;

import variante.abstractions.Bouton;
import variante.abstractions.Menu;
import variante.abstractions.ThemeFactory;
import variante.models.LightBouton;
import variante.models.LightMenu;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public Bouton creerBouton() {
        return new LightBouton();
    }

    @Override
    public Menu creerMenu() {
        return new LightMenu();
    }
}
