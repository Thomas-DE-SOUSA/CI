package com.example.demo.entity;

import jakarta.persistence.*;

@Entity

@Table(name = "Utilisateurs")

public class Utilisateur {

public Utilisateur(Long idUtilisateur, String nomUtilisateur, String prenom, String adresseEmail, String motDePasse,
			String role) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.prenom = prenom;
		this.adresseEmail = adresseEmail;
		this.motDePasse = motDePasse;
		this.role = role;
	}

@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long idUtilisateur;

@Column(nullable = false, length = 60)

private String nomUtilisateur;

@Column(nullable = false, length = 60)

private String prenom ;

@Column(nullable = false, length = 60 ,unique = true)

private String adresseEmail;

@Column(nullable = false, length = 250)

private String motDePasse;

public Long getIdUtilisateur() {
	return idUtilisateur;
}

public void setIdUtilisateur(Long idUtilisateur) {
	this.idUtilisateur = idUtilisateur;
}

public String getNomUtilisateur() {
	return nomUtilisateur;
}

public void setNomUtilisateur(String nomUtilisateur) {
	this.nomUtilisateur = nomUtilisateur;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getAdresseEmail() {
	return adresseEmail;
}

public void setAdresseEmail(String adresseEmail) {
	this.adresseEmail = adresseEmail;
}

public String getMotDePasse() {
	return motDePasse;
}

public void setMotDePasse(String motDePasse) {
	this.motDePasse = motDePasse;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

@Column(nullable = false, length = 60)

private String role;

public Utilisateur() {}



@Override
public String toString() {
	return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur + ", prenom=" + prenom
			+ ", adresseEmail=" + adresseEmail + ", motDePasse=" + motDePasse + ", role=" + role + "]";
}

}




