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
@Table(name="tb_vantagem")
public class Vantagem implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name="id_vantagem", insertable=false, updatable=false)
	private Integer idVantagem;
	
	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "nivel")
	private Integer nivel;
	
	@ManyToOne
	@JoinColumn(name = "id_sistema")
	private Sistema sistema;

	private Integer custo;
	
	private Character tipoVantagem;
	
	@Column(name = "flag_ativo")
	private Boolean flagAtivo;

	public Integer getIdVantagem() {
		return idVantagem;
	}

	public void setIdVantagem(Integer idVantagem) {
		this.idVantagem = idVantagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public Boolean getFlagAtivo() {
		return flagAtivo;
	}

	public void setFlagAtivo(Boolean flagAtivo) {
		this.flagAtivo = flagAtivo;
	}

}