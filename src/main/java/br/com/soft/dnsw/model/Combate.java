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
@Table(name = "tb_combate")
public class Combate implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_combate")
	private Integer idCombate;
	
	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "id_sistema")
	private Sistema sistema;
	
	@Column(name = "flag_ativo")
	private Boolean flagAtivo;

	public Integer getIdCombate() {
		return idCombate;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public Boolean getFlagAtivo() {
		return flagAtivo;
	}

	public void setIdCombate(Integer idCombate) {
		this.idCombate = idCombate;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public void setFlagAtivo(Boolean flagAtivo) {
		this.flagAtivo = flagAtivo;
	}

}