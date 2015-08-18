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
@Table(name = "tb_associa_personagem_atributo")
public class AssociaPersonagemAtributo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_associa_personagem_atributo")
	private Integer idAssociaPersonagemAtributo;

	@ManyToOne
	@JoinColumn(name = "id_personagem")
	private Personagem personagem;
	
	@ManyToOne
	@JoinColumn(name = "id_atributo")
	private Atributo atributo;
	
	@Column(name = "valor")
	private Integer valor;

	public Integer getIdAssociaPersonagemAtributo() {
		return idAssociaPersonagemAtributo;
	}

	public void setIdAssociaPersonagemAtributo(Integer idAssociaPersonagemAtributo) {
		this.idAssociaPersonagemAtributo = idAssociaPersonagemAtributo;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public Atributo getAtributo() {
		return atributo;
	}

	public void setAtributo(Atributo atributo) {
		this.atributo = atributo;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
}