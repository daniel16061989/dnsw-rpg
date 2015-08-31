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
@Table(name = "tb_personagem")
public class Personagem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_personagem")
	private Integer idPersonagem;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "experiencia")
	private Integer experiencia;
	
	@Column(name = "total_experiencia")
	private Integer totalExperiencia;
	
	@ManyToOne
	@JoinColumn(name = "id_raca")
	private Raca raca;
	
	@ManyToOne
	@JoinColumn(name = "id_classe")
	private Classe classe;
	
	@ManyToOne
	@JoinColumn(name = "id_tendencia")
	private Tendencia tendencia;
	
	@ManyToOne
	@JoinColumn(name = "id_divindade")
	private Divindade divindade;
			
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "id_campanha")
	private Campanha campanha;
	
	@ManyToOne
	@JoinColumn(name = "id_sistema")
	private Sistema sistema;
	
	@Column(name = "flag_ativo")
	private Boolean flagAtivo;

	public Integer getIdPersonagem() {
		return idPersonagem;
	}

	public void setIdPersonagem(Integer idPersonagem) {
		this.idPersonagem = idPersonagem;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Campanha getCampanha() {
		return campanha;
	}

	public void setCampanha(Campanha campanha) {
		this.campanha = campanha;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Tendencia getTendencia() {
		return tendencia;
	}

	public void setTendencia(Tendencia tendencia) {
		this.tendencia = tendencia;
	}

	public Divindade getDivindade() {
		return divindade;
	}

	public void setDivindade(Divindade divindade) {
		this.divindade = divindade;
	}

	public Integer getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}

	public Integer getTotalExperiencia() {
		return totalExperiencia;
	}

	public void setTotalExperiencia(Integer totalExperiencia) {
		this.totalExperiencia = totalExperiencia;
	}

}