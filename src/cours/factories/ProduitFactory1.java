package cours.factories;

import cours.abstractions.IProduitFactory;
import cours.abstractions.ProduitA;
import cours.abstractions.ProduitB;
import cours.models.ProduitA1;
import cours.models.ProduitB1;

public class ProduitFactory1 implements IProduitFactory {
    @Override
    public ProduitA getProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB1();
    }
}
