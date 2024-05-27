package com.moimeme.produits.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCat;
    private String nomCat;
    private String descritpionCat;

    @JsonIgnore
    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits;

//    public Categorie() {}
//
//    public Categorie(String nomCat, String descritpionCat, List<Produit> produits) {
//        this.nomCat = nomCat;
//        this.descritpionCat = descritpionCat;
//        this.produits = produits;
//    }

    public Long getIdCat() {
        return idCat;
    }

    public void setIdCat(Long idCat) {
        this.idCat = idCat;
    }

    public String getNomCat() {
        return nomCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }

    public String getDescritpionCat() {
        return descritpionCat;
    }

    public void setDescritpionCat(String descritpionCat) {
        this.descritpionCat = descritpionCat;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }


}
