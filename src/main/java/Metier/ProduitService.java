package Metier;
import com.assem.Produit;


import java.util.HashMap;
import java.util.Map;

public class ProduitService {

    private Map<Long, Produit> produits = new HashMap<>();



    public void createProduit(Produit produit) throws Exception {
        if (produits.containsKey(produit.getId()) || produits.containsValue(produit)) {
            throw new Exception("Produit déjà existant");
        }
        if (produit.getPrix() <= 0 || produit.getQuantite() < 0) {
            throw new Exception("Données invalides");
        }
        produits.put(produit.getId(), produit);
    }




}
