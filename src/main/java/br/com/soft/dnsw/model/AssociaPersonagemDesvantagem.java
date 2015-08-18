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
@Table(name = "tb_associa_personagem_desvantagem")
public class AssociaPersonagemDesvantagem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_associa_personagem_desvantagem")
	private Integer idAssociaPersonagemDesvantagem;

	@ManyToOne
	@JoinColumn(name = "id_personagem")
	private Personagem personagem;
	
	@ManyToOne
	@JoinColumn(name = "id_desvantagem")
	private Desvantagem desvantagem;

	public Integer getIdAssociaPersonagemDesvantagem() {
		return idAssociaPersonagemDesvantagem;
	}

	public void setIdAssociaPersonagemDesvantagem(
			Integer idAssociaPersonagemDesvantagem) {
		this.idAssociaPersonagemDesvantagem = idAssociaPersonagemDesvantagem;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public Desvantagem getDesvantagem() {
		return desvantagem;
	}

	public void setDesvantagem(Desvantagem desvantagem) {
		this.desvantagem = desvantagem;
	}

}