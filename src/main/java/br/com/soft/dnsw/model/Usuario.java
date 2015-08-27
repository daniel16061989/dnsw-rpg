package br.com.soft.dnsw.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name="id_usuario", insertable=false, updatable=false)
	private Integer idUsuario;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="login")
	private String login;
	
	@Column(name="senha")
	private String senha;
	
	@Column(name="email")
	private String email;
	
	@Column(name="apelido")
	private String apelido;
	
	@Column(name="status")
	private Character status;
	
	@Column(name="data_criacao")
	private String dataCriacao;
	
	@Column(name="data_alteracao")
	private String dataAlteracao;
	
	@Column(name = "status_jogador")
	private Character statusJogador;
	
	@Column(name = "status_mestre")
	private Character statusMestre;
	
	@Column(name = "flag_ativo")
	private Boolean flagAtivo;
	
	public static final Character STATUS_OTIMO = 'O';
	public static final Character STATUS_BOM = 'B';
	public static final Character STATUS_REGULAR = 'R';
	public static final Character STATUS_RUIM = 'Z';
	public static final Character STATUS_INICIANTE = 'I';
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Character getStatus() {
		return status;
	}
	
	public void setStatus(Character status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(String dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Character getStatusMestre() {
		return statusMestre;
	}

	public void setStatusMestre(Character statusMestre) {
		this.statusMestre = statusMestre;
	}

	public Character getStatusJogador() {
		return statusJogador;
	}

	public void setStatusJogador(Character statusJogador) {
		this.statusJogador = statusJogador;
	}

	public Boolean getFlagAtivo() {
		return flagAtivo;
	}

	public void setFlagAtivo(Boolean flagAtivo) {
		this.flagAtivo = flagAtivo;
	}
	
}