package com.moimeme.produits.restcontrollers;

import com.moimeme.produits.dto.ProduitDTO;
import com.moimeme.produits.entities.Produit;
import com.moimeme.produits.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {

    @Autowired
    ProduitService produitService;

    @RequestMapping(method = RequestMethod.GET)
    public List<ProduitDTO> getAllProduits() {
        return produitService.getAllProduits();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ProduitDTO getProduitById(@PathVariable("id") Long id) {
        return produitService.getProduit(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ProduitDTO createProduit(@RequestBody ProduitDTO produitDTO) {
        return produitService.saveProduit(produitDTO);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public ProduitDTO updateProduit(@RequestBody ProduitDTO produitDTO) {
        return produitService.updateProduit(produitDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteProduit(@PathVariable("id") Long id) {
        produitService.deleteProduitById(id);
    }

    @RequestMapping(value = "/prodscat/{idCat}", method = RequestMethod.GET)
    public List<Produit> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
        return produitService.findByCategorieIdCat(idCat);
    }

    @RequestMapping(value="/prodsByName/{nom}",method = RequestMethod.GET)
    public List<Produit> findByNomProduitContains(@PathVariable("nom") String nom) {
        return produitService.findByNomProduitContains(nom);
    }


}
