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
@Table(name = "tb_associa_personagem_pericia")
public class AssociaPersonagemPericia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_associa_personagem_classe")
	private Integer idAssociaPersonagemPericia;

	@ManyToOne
	@JoinColumn(name = "id_personagem")
	private Personagem personagem;
	
	@ManyToOne
	@JoinColumn(name = "id_pericia")
	private Pericia pericia;
	
	@Column(name = "valor")
	private Integer valor;

	public Integer getIdAssociaPersonagemPericia() {
		return idAssociaPersonagemPericia;
	}

	public void setIdAssociaPersonagemPericia(Integer idAssociaPersonagemPericia) {
		this.idAssociaPersonagemPericia = idAssociaPersonagemPericia;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public Pericia getPericia() {
		return pericia;
	}

	public void setPericia(Pericia pericia) {
		this.pericia = pericia;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

}