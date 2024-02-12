package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Produit;
import com.example.demo.services.ProduitService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {
  @Autowired
  ProduitService produitService;

  @RequestMapping(method = RequestMethod.GET)
  public List < Produit > getAllProduits() {
    return produitService.getAllProduits();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET) public
  Produit getProduitById(@PathVariable("id") Long id) {
    return produitService.getProduit(id);
  }

  @RequestMapping(method = RequestMethod.POST)
  public Produit createProduit(@RequestBody Produit produit) {
    return produitService.saveProduit(produit);
  }

  @RequestMapping(method = RequestMethod.PUT)
  public Produit updateProduit(@RequestBody Produit produit) {
    return produitService.updateProduit(produit);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteProduit(@PathVariable("id") Long id) {
    produitService.deleteProduitById(id);
  }

  @RequestMapping(value = "/prodscat/{idCat}", method = RequestMethod.GET)
  public List < Produit > getProduitsByCatId(@PathVariable("idCat") Long idCat) {
    return produitService.findByCategorieIdCat(idCat);
  }
}