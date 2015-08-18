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
@Table(name = "tb_associa_personagem_classe")
public class AssociaPersonagemClasse implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_associa_personagem_classe")
	private Integer idAssociaPersonagemClasse;

	@ManyToOne
	@JoinColumn(name = "id_personagem")
	private Personagem personagem;
	
	@ManyToOne
	@JoinColumn(name = "id_classe")
	private Classe classe;

	public Integer getIdAssociaPersonagemClasse() {
		return idAssociaPersonagemClasse;
	}

	public void setIdAssociaPersonagemClasse(Integer idAssociaPersonagemClasse) {
		this.idAssociaPersonagemClasse = idAssociaPersonagemClasse;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

}