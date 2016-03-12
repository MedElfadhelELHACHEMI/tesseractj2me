/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

/**
 *
 * @author BoB
 */
public class Organisation extends Utilisateur {
    
    public Organisation() {
    }
 public Organisation(Organisation O) {
      this.idUtilisateur = O.getIdUtilisateur();
        this.nomUtilisateur = O.getNomUtilisateur();
        this.motDePass = O.getMotDePass();
        this.nom = O.getNom();
        this.tel = O.getTel();
        this.adresse = O.getAdresse();
        this.mail = O.getMail();
        this.photo = O.getPhoto();
        this.Role=O.getRole(); 
    }

    public Organisation(int idUtilisateur, String nomUtilisateur, String motDePass, String nom, int tel, String adresse, String mail, String photo, String Role) {
        super(idUtilisateur, nomUtilisateur,  motDePass, nom, tel, adresse, mail, photo, Role);
    }

    public Organisation(String nomUtilisateur, String motDePass, String nom, int tel, String adresse, String mail, String photo, String Role) {
        super(nomUtilisateur, motDePass, nom, tel, adresse, mail, photo, Role);
    }
    
   public String toString(){
        return super.toString()+ " /n Organisation";
   }
}
