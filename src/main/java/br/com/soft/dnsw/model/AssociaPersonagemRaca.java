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
@Table(name = "tb_associa_personagem_raca")
public class AssociaPersonagemRaca implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_associa_personagem_classe")
	private Integer idAssociaPersonagemRaca;

	@ManyToOne
	@JoinColumn(name = "id_personagem")
	private Personagem personagem;
	
	@ManyToOne
	@JoinColumn(name = "id_raca")
	private Raca raca;

	public Integer getIdAssociaPersonagemRaca() {
		return idAssociaPersonagemRaca;
	}

	public void setIdAssociaPersonagemRaca(Integer idAssociaPersonagemRaca) {
		this.idAssociaPersonagemRaca = idAssociaPersonagemRaca;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

}