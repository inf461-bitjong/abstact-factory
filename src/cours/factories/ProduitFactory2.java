package cours.factories;

import cours.abstractions.IProduitFactory;
import cours.abstractions.ProduitA;
import cours.abstractions.ProduitB;
import cours.models.ProduitA2;
import cours.models.ProduitB2;

public class ProduitFactory2 implements IProduitFactory {
    @Override
    public ProduitA getProduitA() {
        return new ProduitA2();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB2();
    }
}
