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
@Table(name = "tb_atributo")
public class Atributo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_atributo")
	private Integer idAtributo;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "sigla")
	private String sigla;

	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "ordem")
	private Integer ordem;
	
	@Column(name = "cadastro_manual")
	private Boolean cadastroManual;
	
	@ManyToOne
	@JoinColumn(name = "id_sistema")
	private Sistema sistema;
	
	@Column(name = "flag_ativo")
	private Boolean flagAtivo;

	public Integer getIdAtributo() {
		return idAtributo;
	}

	public void setIdAtributo(Integer idAtributo) {
		this.idAtributo = idAtributo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
	
	public Boolean getCadastroManual() {
		return cadastroManual;
	}

	public void setCadastroManual(Boolean cadastroManual) {
		this.cadastroManual = cadastroManual;
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