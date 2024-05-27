package com.moimeme.produits.service;

import com.moimeme.produits.dto.ProduitDTO;
import com.moimeme.produits.entities.Categorie;
import com.moimeme.produits.entities.Produit;

import java.util.List;

public interface ProduitService {

    ProduitDTO saveProduit(ProduitDTO p);
    ProduitDTO updateProduit(ProduitDTO p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);
    ProduitDTO getProduit(Long id);
    List<ProduitDTO> getAllProduits();
    List<Produit> findByNomProduit(String nom);
    List<Produit> findByNomProduitContains(String nom);
    List<Produit> findByNomPrix(String nom, Double prix);
    List<Produit> findByCategorie(Categorie categorie);
    List<Produit> findByCategorieIdCat(Long id);
    List<Produit> findByOrderByNomProduitAsc();
    List<Produit> trierProduitsNomsPrix();
    ProduitDTO convertEntityToDto (Produit produit);
    Produit convertDtoToEntity(ProduitDTO produitDto);
}
