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
@Table(name = "tb_cabecalho_ficha")
public class CabecalhoFicha implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_cabecalho_ficha")
	private Integer idCabecalhoFicha;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "id_sistema")
	private Sistema sistema;
	
	@Column(name = "ordem")
	private Integer ordem;
	
	@Column(name = "cadastro_manual")
	private Boolean cadastroManual;
	
	@Column(name = "flag_ativo")
	private Boolean flagAtivo;

	public Integer getIdCabecalhoFicha() {
		return idCabecalhoFicha;
	}

	public void setIdCabecalhoFicha(Integer idCabecalhoFicha) {
		this.idCabecalhoFicha = idCabecalhoFicha;
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