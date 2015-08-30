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
@Table(name = "tb_associa_personagem_tendencia")
public class AssociaPersonagemTendencia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_associa_personagem_tendencia")
	private Integer idAssociaPersonagemTendencia;

	@ManyToOne
	@JoinColumn(name = "id_personagem")
	private Personagem personagem;
	
	@ManyToOne
	@JoinColumn(name = "id_vantagem")
	private Vantagem vantagem;

	public Integer getIdAssociaPersonagemTendencia() {
		return idAssociaPersonagemTendencia;
	}

	public void setIdAssociaPersonagemTendencia(Integer idAssociaPersonagemTendencia) {
		this.idAssociaPersonagemTendencia = idAssociaPersonagemTendencia;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public Vantagem getVantagem() {
		return vantagem;
	}

	public void setVantagem(Vantagem vantagem) {
		this.vantagem = vantagem;
	}

}