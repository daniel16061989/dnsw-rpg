package br.com.soft.dnsw.model;

import java.io.Serializable;
import java.util.Date;

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
	
	@Column(name="login", nullable=false)
	private String login;
	
	@Column(name="senha", nullable=false)
	private String senha;
	
	@Column(name="email")
	private String email;
	
	@Column(name="apelido")
	private String apelido;
	
	@Column(name="status", nullable=false)
	private Character status;
	
	@Column(name="data_criacao", nullable=false)
	private Date dataCriacao;
	
	@Column(name="data_alteracao", nullable=true)
	private Date dataAlteracao;
	
	@Column(name = "campanhas_jogadas")
	private Integer campanhasJogadas;
	
	@Column(name = "campanhas_mestradas")
	private Integer campanhasMestradas;
	
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
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	
	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Integer getCampanhasJogadas() {
		return campanhasJogadas;
	}

	public void setCampanhasJogadas(Integer campanhasJogadas) {
		this.campanhasJogadas = campanhasJogadas;
	}

	public Integer getCampanhasMestradas() {
		return campanhasMestradas;
	}

	public void setCampanhasMestradas(Integer campanhasMestradas) {
		this.campanhasMestradas = campanhasMestradas;
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