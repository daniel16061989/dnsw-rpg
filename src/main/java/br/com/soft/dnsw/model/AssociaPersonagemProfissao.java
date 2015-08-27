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
@Table(name = "tb_associa_personagem_profissao")
public class AssociaPersonagemProfissao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_associa_personagem_profissao")
	private Integer idAssociaPersonagemProfissao;

	@ManyToOne
	@JoinColumn(name = "id_personagem")
	private Personagem personagem;
	
	@ManyToOne
	@JoinColumn(name = "id_pericia")
	private Profissao profissao;
	
	@Column(name = "nivel")
	private Integer nivel;

	public Integer getIdAssociaPersonagemProfissao() {
		return idAssociaPersonagemProfissao;
	}

	public void setIdAssociaPersonagemProfissao(Integer idAssociaPersonagemProfissao) {
		this.idAssociaPersonagemProfissao = idAssociaPersonagemProfissao;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

}