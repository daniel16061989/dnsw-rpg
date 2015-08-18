package br.com.soft.dnsw.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
@Entity
@Table(name = "tb_associa_personagem_magia")
public class AssociaPersonagemMagia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_associa_personagem_classe")
	private Integer idAssociaPersonagemMagia;

	@ManyToOne
	@JoinColumn(name = "id_personagem")
	private Personagem personagem;
	
	@ManyToOne
	@JoinColumn(name = "id_magia")
	private Magia magia;

	public Integer getIdAssociaPersonagemMagia() {
		return idAssociaPersonagemMagia;
	}

	public void setIdAssociaPersonagemMagia(Integer idAssociaPersonagemMagia) {
		this.idAssociaPersonagemMagia = idAssociaPersonagemMagia;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public Magia getMagia() {
		return magia;
	}

	public void setMagia(Magia magia) {
		this.magia = magia;
	}

}